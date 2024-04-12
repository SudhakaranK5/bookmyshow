package com.sudhakar.bookmyshow.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhakar.bookmyshow.Entity.User;
import com.sudhakar.bookmyshow.Repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveDetails (User user){
           return userRepo.save(user);
    }
}
