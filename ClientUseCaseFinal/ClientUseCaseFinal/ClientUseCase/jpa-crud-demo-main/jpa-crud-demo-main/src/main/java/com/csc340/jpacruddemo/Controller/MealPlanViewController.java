/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import com.csc340.jpacruddemo.Entity.MealPlan;
import com.csc340.jpacruddemo.Service.MealPlanService;
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
@RequestMapping("mealPlan")
public class MealPlanViewController {
    @Autowired
    private MealPlanService mealPlanService;

    @GetMapping("/view")
    public String viewPastMeals(Model model) {
        List<MealPlan> meals = mealPlanService.getAllMealPlans();
        model.addAttribute("meals", meals);
        return "ClientPages/viewPastMeals";
    }
}
