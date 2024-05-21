package com.sudhakar.bookmyshow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhakar.bookmyshow.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
