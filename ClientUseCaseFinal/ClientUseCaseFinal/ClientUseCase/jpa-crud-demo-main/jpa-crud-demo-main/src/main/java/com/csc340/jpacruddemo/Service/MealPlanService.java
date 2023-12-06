/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Service;

import com.csc340.jpacruddemo.Repository.MealPlanRepository;
import com.csc340.jpacruddemo.Entity.MealPlan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bilal
 */
@Service
public class MealPlanService {

    @Autowired
    private MealPlanRepository mealPlanRepository;

    public List<MealPlan> getAllMealPlans() {
        return mealPlanRepository.findAll();
    }

    public void saveMealPlan(MealPlan mealPlan) {
        mealPlanRepository.save(mealPlan);
    }

    
}
