package com.sudhakar.bookmyshow.Controller;

import com.sudhakar.bookmyshow.Entity.Booking;
import com.sudhakar.bookmyshow.Service.BookingService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public Booking createBooking(@RequestParam Long movieId, @RequestParam int numberOfSeats) {
        return bookingService.createBooking(movieId, numberOfSeats);
    }
}
