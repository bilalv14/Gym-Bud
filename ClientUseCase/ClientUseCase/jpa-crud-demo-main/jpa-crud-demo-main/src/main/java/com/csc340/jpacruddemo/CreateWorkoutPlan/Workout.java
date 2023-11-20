/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.CreateWorkoutPlan;

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
@Table(name = "Workouts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Workout {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
  private String exercise;  
  private String customExerciseName;
  private double weight;
  private int reps;
  private int sets;
  
 
  public Workout(String exercise, String customExerciseName, double weight, int reps, int sets){
      this.exercise = exercise;
      this.customExerciseName = customExerciseName;
      this.weight = weight;
      this.reps = reps;
      this.sets = sets;
  }
}
