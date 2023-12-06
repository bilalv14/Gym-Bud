/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Service;

import com.csc340.jpacruddemo.Repository.NewUserRepository;
import com.csc340.jpacruddemo.Entity.NewUser;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author bilalzahid
 */
@Service
public class NewUserService {

    @Autowired
    private NewUserRepository repo;
    
     @Autowired
     PasswordEncoder passwordEncoder;
             
    public List<NewUser> getAllWorkouts() {
        return repo.findAll();
    }
    
    public void saveUser(NewUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
         repo.save(user);
    }
    
    
     public List<NewUser> getUsersByType(String userType) {
        return repo.findByUserType("gym_member");
    }
    
    public void deleteUser(long userId) {
        repo.deleteById(userId);
    }
    
}

