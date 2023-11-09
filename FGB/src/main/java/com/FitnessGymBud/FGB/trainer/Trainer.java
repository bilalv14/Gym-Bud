/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FitnessGymBud.FGB.trainer;
/**
 *
 * @author Khawaja Roahn Waheed
 */
public class Trainer {
    private int trainerId;
    private String trainerName;
    private double balance = 0.0; // This will represent the amount of money the trainer has been paid.

    // Constructor
    public Trainer(int trainerId, String trainerName) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
    }

    // Getter for trainerId
    public int getTrainerId() {
        return trainerId;
    }

    // Setter for trainerId
    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    // Getter for trainerName
    public String getTrainerName() {
        return trainerName;
    }

    // Setter for trainerName
    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to receive payment
    public void receivePayment(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Trainer [ID: " + trainerId + ", Name: " + trainerName + ", Balance: $" + balance + "]";
    }

    // Overriding equals() to provide a comparison based on unique trainerId
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Trainer otherTrainer = (Trainer) obj;
        return trainerId == otherTrainer.trainerId;
    }

    // Overriding hashCode() to provide a hash based on unique trainerId
    @Override
    public int hashCode() {
        return Integer.hashCode(trainerId);
    }
}
