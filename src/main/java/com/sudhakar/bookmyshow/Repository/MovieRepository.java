package com.sudhakar.bookmyshow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<com.sudhakar.bookmyshow.Entity.Movie, Long> {
}
