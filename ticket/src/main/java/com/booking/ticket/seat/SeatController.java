package com.booking.ticket.seat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SeatController
{
    @RequestMapping("getSeats")
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

    @RequestMapping("bookSeats")
    public List<Integer> bookSeats(@RequestBody List<Integer> ids){
        System.out.println(ids);
        List<Integer> seat_not_booked = new ArrayList();
        // save the id to DB. and return the success code 0; if some conflicting seat then return the 
        seat_not_booked.add(2);
        return seat_not_booked;
    }
    @RequestMapping("")
    public Integer root(){
        System.out.println("Website is up");
        return 0;
    }
}