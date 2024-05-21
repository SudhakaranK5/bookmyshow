package com.sudhakar.bookmyshow.Entity;

import lombok.Data;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie_id;
    
    @Column(nullable = false)
    private Date bookingDate;
    
    @Column(nullable = false)
    private int numberOfSeats;

    public static Booking createBooking(Long movieId, int numberOfSeats) {
        throw new UnsupportedOperationException("Unimplemented method 'createBooking'");
    }
}
