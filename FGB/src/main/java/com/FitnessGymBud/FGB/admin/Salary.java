
package com.FitnessGymBud.FGB.admin;

/**
 *
 * @author kwaheed
 */
public class Salary {
    private double baseSalary; // Basic monthly salary
    private double bonus;      // Any bonuses received
    private double deductions; // Any deductions, such as for taxes, insurance, etc.
    private double totalSalary; // Calculated as baseSalary + bonus - deductions

    // Constructor
    public Salary(double baseSalary, double bonus, double deductions) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.deductions = deductions;
        this.calculateTotalSalary();
    }

    // Getter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter for baseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        this.calculateTotalSalary();
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
        this.calculateTotalSalary();
    }

    // Getter for deductions
    public double getDeductions() {
        return deductions;
    }

    // Setter for deductions
    public void setDeductions(double deductions) {
        this.deductions = deductions;
        this.calculateTotalSalary();
    }

    // Getter for totalSalary
    public double getTotalSalary() {
        return totalSalary;
    }

    // Method to calculate the total salary
    private void calculateTotalSalary() {
        this.totalSalary = this.baseSalary + this.bonus - this.deductions;
    }

    @Override
    public String toString() {
        return "Salary [Base Salary: $" + baseSalary + ", Bonus: $" + bonus + ", Deductions: $" + deductions + ", Total Salary: $" + totalSalary + "]";
    }
}
