package com.booking.ticket.seat;


import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Seat {
    @Id
    private Integer id;
    private Boolean booked;
    private Integer cost;

    public Seat() {
    }

    public Seat(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Seat(Integer id, Boolean booked, Integer cost) {
        this.id = id;
        this.booked = booked;
        this.cost = cost;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    public Integer getCost(){
        return cost;
    }

    public void setCost(Integer cost){
        this.cost = cost;
    }
}