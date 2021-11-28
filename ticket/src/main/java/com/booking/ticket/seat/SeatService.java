// this file will contain the implementaion for the method for APIs.
package com.booking.ticket.seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> getSeats() {
        return seatRepository.findAll();
    }

    public List<Integer> bookSeat(List<Integer> ids) {
        List<Seat> seats = seatRepository.findAllById(ids);
        List<Integer> seat_not_booked = new ArrayList();
        // save the id to DB. and return the success code 0; if some conflicting seat then return the conflicting values.
        for (Seat seat : seats) {
            if (!seat.getBooked()) {
                seat.setBooked(true);
            }
            else seat_not_booked.add(seat.getId());
        }
        seatRepository.saveAll(seats);
        return seat_not_booked;
    }

}