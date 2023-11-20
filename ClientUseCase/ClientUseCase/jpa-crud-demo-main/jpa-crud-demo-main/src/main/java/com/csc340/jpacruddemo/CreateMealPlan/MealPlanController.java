/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.CreateMealPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bilal
 */
@Controller
@RequestMapping("/mealPlan")
public class MealPlanController {

    @Autowired
    private MealPlanService mealPlanService;

    @GetMapping("/show")
    public String showCreateMealPlanForm(Model model) {
        return "clientPages/create_meal_plan_client";
    }

    @PostMapping("/create")
    public String createMealPlan(@ModelAttribute("mealPlan") MealPlan mealPlan) {
        mealPlanService.saveMealPlan(mealPlan);
        return "clientPages/create_meal_plan_client";
    }

    @GetMapping("/view")
    public String viewMealPlan(Model model) {
        model.addAttribute("mealPlanList", mealPlanService.getAllMealPlans());
        return "clientPages/create_meal_plan_client";
    }
}
