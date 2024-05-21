package com.sudhakar.bookmyshow.Service;

import com.sudhakar.bookmyshow.Entity.Booking;
import com.sudhakar.bookmyshow.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private MovieService movieService; 

    public Booking createBooking(Long movieId, int numberOfSeats) {
        Booking booking = new Booking();
        booking.setMovie_id(movieService.getMovieById(movieId).orElse(null));
        booking.setBookingDate(new Date());
        booking.setNumberOfSeats(numberOfSeats);
        return bookingRepository.save(booking);
    }
}
