package com.booking.ticket.seat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SeatController
{

    private final SeatService seatService;

    @RequestMapping("getSeats")
    public List<Seat> getSeat(){
        return seatService.getSeats();
    }

    @RequestMapping("bookSeats")
    public List<Integer> bookSeats(@RequestBody List<Integer> ids){
        return seatService.bookSeat(ids);
    }
    @RequestMapping("")
    public Integer root(){
        System.out.println("Website is up");
        return 0;
    }
}