// this file will add values to DB.
package com.booking.ticket;

import com.booking.ticket.seat.Seat;
import com.booking.ticket.seat.SeatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketApplicationConfig implements CommandLineRunner {


    @Autowired
    private SeatRepository seatRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Seat> seats= new ArrayList<>();
        for(Integer row = 0; row < 8; row++) {
            for (Integer col = 0; col < 8; col++) {
                Integer id = row*10 + col;
                Seat seat = new Seat(id, false,10);
                seats.add(seat);
            }
        }
        seatRepository.saveAll(seats);
    }
}