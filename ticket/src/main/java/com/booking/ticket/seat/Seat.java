package com.booking.seat;


import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Seat {
    @Id
    private String id;
    private Boolean booked;
    private Integer cost;

    public Seat() {
    }

    public Seat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Seat(String id, Boolean booked, Integer cost) {
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