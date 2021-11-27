package com.example.bookingsystem.seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
    //inheriting JPARepo methods
}