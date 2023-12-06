/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Service;

import com.csc340.jpacruddemo.Entity.Workout;
import com.csc340.jpacruddemo.Repository.ViewWorkoutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bilalzahid
 */
@Service
public class ViewWorkoutService {

    @Autowired
    private ViewWorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}
