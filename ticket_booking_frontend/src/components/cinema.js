// eslint-disable-next-line 
/* eslint-disable */
import '../App.css';
import clsx from 'clsx'
import React, { useState, useEffect } from 'react';
const axios = require('axios');


//post api --> localhost:8080/bookSeats
//get api --> localhost:8080/getSeats
const seats = Array.from({ length: 8 * 8 }, (_, i) => i);

export function Cinema({ onSelectedSeatsChange }) {
    const [selectedSeats, setSelectedSeats] = useState([])
    function handleSelectedState(seat) {
      const isSelected = selectedSeats.includes(seat)
      if (isSelected) {
        setSelectedSeats(
          selectedSeats.filter(selectedSeat => selectedSeat !== seat),
        )
      } else {
        setSelectedSeats([...selectedSeats, seat]);
      }
    }
    
    
    return (
      <div className="Cinema">
        <div className="screen" />
  
        <div className="seats">
          {seats.map(seat => {
            const isSelected = selectedSeats.includes(seat)
            //backend call se return array.
            const isOccupied = false
            return (
              <span
                tabIndex="0"
                key={seat}
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
      </div>
    )
  }