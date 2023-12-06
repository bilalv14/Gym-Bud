/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Service;

import com.csc340.jpacruddemo.Entity.Users;
import com.csc340.jpacruddemo.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author bilalzahid
 */
@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UsersService(UsersRepository usersRepository, BCryptPasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean login(String username, String password) {
        // Find the user by username from the database
        Users user = usersRepository.findByUsername(username);

        // Check if the user exists and if the provided password matches the stored hashed password
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return true; // Credentials are valid
        } else {
            return false; // Invalid credentials
        }
    }
}
