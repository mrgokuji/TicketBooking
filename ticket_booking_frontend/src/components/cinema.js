/* eslint-disable */ 
import "../App.css";
import React, { useEffect, useState } from 'react'
import clsx from 'clsx'
const axios = require('axios');
import { Button} from 'react-bootstrap';
import { isDOMComponent } from "react-dom/test-utils";

export const Cinema = ()=> {
    const [selectedSeats, setSelectedSeats] = useState([])
    const [totalSeats, setTotalSeats] = useState([])

    function handleSelectedState(seat) {
      const isSelected = selectedSeats.includes(seat)
      if (isSelected) {
        setSelectedSeats(
          selectedSeats.filter(selectedSeat => selectedSeat !== seat),
        )
      } else {
        setSelectedSeats([...selectedSeats, seat])
      }
    }
    
    function getBookedSeats() {
        const url = '/getSeats';
        axios.get(url).
        then((seats) => {
          setTotalSeats(seats.data);
        });
    }

    function handleBookSeat(seatsId) {
        const url = '/bookSeats';
        axios.post(url , seatsId).
        then((seats) => {
          console.log(seats);
        })
        .catch((err) => {
          console.log(err);
        });
        setSelectedSeats([]);
        getBookedSeats();
    }

    function bookSeat() {
        console.log("Booking seats", selectedSeats);
        let ids = [];
        for(let i = 0; i< selectedSeats.length; i++) {
          ids.push(selectedSeats[i].id);
        }
        handleBookSeat(ids);
    }

    useEffect(()=> {
        getBookedSeats();
    },[]);

    return (
      <div className="Cinema">
        <div className="screen" />
  
        <div className="seats">
          {totalSeats.map(seat => {
            const isSelected = selectedSeats.includes(seat)
            const isOccupied = seat.booked
            return (
              <span
                tabIndex="0"
                key={seat.id}
                className={clsx(
                  'seat',
                  isSelected && 'selected',
                  isOccupied && 'occupied',
                )}
                onClick={isOccupied ? null : () => handleSelectedState(seat)}
                onKeyPress={
                  isOccupied
                    ? null
                    : e => {
                        if (e.key === 'Enter') {
                          handleSelectedState(seat)
                        }
                      }
                }
              />
            )
          })}
        </div>
        <Button onClick={bookSeat}>
            Book seat
        </Button>
      </div>
    )
  }
