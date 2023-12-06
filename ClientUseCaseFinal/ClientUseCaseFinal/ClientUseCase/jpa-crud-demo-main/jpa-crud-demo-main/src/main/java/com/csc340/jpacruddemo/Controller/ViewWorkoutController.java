/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import com.csc340.jpacruddemo.Entity.Workout;
import com.csc340.jpacruddemo.Service.ViewWorkoutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bilalzahid
 */
@Controller
@RequestMapping("/workout")
public class ViewWorkoutController {

    @Autowired
    private ViewWorkoutService workoutService;

    @GetMapping("/pastworkout")
    public String viewWorkouts(Model model) {
        List<Workout> workouts = workoutService.getAllWorkouts();
        model.addAttribute("workouts", workouts);
        return "ClientPages/viewWorkout";
    }
}
