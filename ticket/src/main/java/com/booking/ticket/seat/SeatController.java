package com.booking.ticket.seat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class SeatController
{
    @RequestMapping("seats")
    public List<Seat> getSeat(){
        List<Seat> seats = new ArrayList();
        Seat s1 = new Seat();
        s1.setId(1);
        s1.setCost(100);
        s1.setBooked(false);
        Seat s2 = new Seat(2,false,100);
        seats.add(s1);
        seats.add(s2);
        return seats;
    }
}