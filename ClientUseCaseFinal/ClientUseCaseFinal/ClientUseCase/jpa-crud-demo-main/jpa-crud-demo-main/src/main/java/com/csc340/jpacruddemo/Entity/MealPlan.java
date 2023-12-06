/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author bilal
 */
@Entity
@Table(name = "MealPlans")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String foodName;
    private double protein;
    private double carbs;
    private double fats;
    private int calories;

   public MealPlan(String foodName, double protein, double carbs, double fats, int calories){
       this.foodName = foodName;
       this.protein = protein;
       this.carbs = carbs;
       this.fats = fats;
       this.calories = calories;
   }
}
