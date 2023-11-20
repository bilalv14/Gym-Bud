/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.CreateWorkoutPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bilal
 */
@Controller
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @GetMapping("/show")
    public String showCreateWorkoutForm(Model model) {
        
        return "clientPages/create_workout_plan_client";
    }

    @PostMapping("/create")
    public String createWorkout(Workout workout) {
        workoutService.saveWorkout(workout);
        return "clientPages/create_workout_plan_client.html";
    }

    @GetMapping("/view")
    public String viewWorkoutPlan(Model model) {
        model.addAttribute("workoutList", workoutService.getAllWorkouts());
        return "clientPages/create_workout_plan_client.html";
    }
   
}
