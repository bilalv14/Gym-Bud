/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FitnessGymBud.FGB.admin;

/**
 *
 * @author kwaheed
 */
public class Gym {
    private int gymId;
    private String gymName;

    // Constructor
    public Gym(int gymId, String gymName) {
        this.gymId = gymId;
        this.gymName = gymName;
    }

    // Getter for gymId
    public int getGymId() {
        return gymId;
    }

    // Setter for gymId
    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    // Getter for gymName
    public String getGymName() {
        return gymName;
    }

    // Setter for gymName
    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    @Override
    public String toString() {
        return "Gym [ID: " + gymId + ", Name: " + gymName + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gym otherGym = (Gym) obj;
        return gymId == otherGym.gymId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(gymId);
    }
}
