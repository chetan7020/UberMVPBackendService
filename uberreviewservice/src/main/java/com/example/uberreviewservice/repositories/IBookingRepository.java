package com.example.uberreviewservice.repositories;

import com.example.uberreviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookingRepository extends JpaRepository<Booking, Long> {
}
