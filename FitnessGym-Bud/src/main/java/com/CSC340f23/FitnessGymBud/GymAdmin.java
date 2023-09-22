
package com.CSC340f23.FitnessGymBud;

import java.util.ArrayList;
import java.util.List;
/**
 * Represents the Gym Administration functionality.
 * @author Khawaja Rohan Waheed
 */
public class GymAdmin {

    private List<Gym> gyms;         // List to store all gyms
    private List<Trainer> trainers; // List to store all trainers
    private List<Client> clients;   // List to store all clients
    private List<Payment> payments; // List to store all payments made to trainers

    /**
     * Default constructor initializes empty lists for gyms, trainers, clients, and payments.
     */
    public GymAdmin() {
        gyms = new ArrayList<>();
        trainers = new ArrayList<>();
        clients = new ArrayList<>();
        payments = new ArrayList<>();
    }

    /**
     * Assigns a trainer to a client.
     *
     * @param trainer The trainer to be assigned.
     * @param client  The client who will receive the trainer.
     */
    public void assignTrainerToClient(Trainer trainer, Client client) {
        client.setTrainer(trainer);
    }

    /**
     * Removes a gym from the list of gyms.
     *
     * @param gym The gym to be removed.
     */
    public void removeGym(Gym gym) {
        gyms.remove(gym);
    }

    /**
     * Adds a gym to the list of gyms.
     *
     * @param gym The gym to be added.
     */
    public void addGym(Gym gym) {
        gyms.add(gym);
    }

    /**
     * Pays a trainer a specified amount and records this payment.
     *
     * @param trainer The trainer to be paid.
     * @param amount  The amount to pay the trainer.
     */
    public void payTrainer(Trainer trainer, double amount) {
        Payment payment = new Payment(amount, trainer);
        payments.add(payment);
        trainer.receivePayment(amount);
    }

    /**
     * Removes a client from the list of clients.
     * Also, dissociates the trainer from the removed client.
     *
     * @param client The client to be removed.
     */
    public void removeClient(Client client) {
        clients.remove(client);
        client.setTrainer(null);
    }

    /**
     * Records the monthly salary details for a trainer.
     * 
     * @param trainer     The trainer whose salary is being recorded.
     * @param baseSalary  The monthly base salary for the trainer.
     * @param bonus       Any bonuses the trainer has received.
     * @param deductions  Any deductions for the trainer.
     * @return            The total salary after considering bonuses and deductions.
     */
    public double recordMonthlySalary(Trainer trainer, double baseSalary, double bonus, double deductions) {
        Salary salary = new Salary(baseSalary, bonus, deductions);
        // Here you can store the salary in a data structure or database if needed.
        // For now, we'll simply return the total salary.
        return salary.getTotalSalary();
    }
}