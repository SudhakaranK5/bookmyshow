package com.sudhakar.bookmyshow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudhakar.bookmyshow.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
}
