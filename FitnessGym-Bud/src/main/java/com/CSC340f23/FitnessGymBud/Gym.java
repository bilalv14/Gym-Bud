
package com.CSC340f23.FitnessGymBud;

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

    // Optionally, you may want to override the equals() and hashCode() methods as well
    // to help with comparison and usage in collections. Here's a basic version:

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

