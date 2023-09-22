
package com.CSC340f23.FitnessGymBud;

/**
 *
 * @author kwaheed
 */
public class Client {
    private int clientId;
    private String clientName;
    private Trainer assignedTrainer;

    // Constructor
    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    // Getter for clientId
    public int getClientId() {
        return clientId;
    }

    // Setter for clientId
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    // Getter for clientName
    public String getClientName() {
        return clientName;
    }

    // Setter for clientName
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    // Getter for assignedTrainer
    public Trainer getAssignedTrainer() {
        return assignedTrainer;
    }

    // Setter for assignedTrainer
    public void setTrainer(Trainer trainer) {
        this.assignedTrainer = trainer;
    }

    @Override
    public String toString() {
        return "Client [ID: " + clientId + ", Name: " + clientName + ", Trainer: " + 
               (assignedTrainer != null ? assignedTrainer.getTrainerName() : "Not Assigned") + "]";
    }

    // Overriding equals() to provide a comparison based on unique clientId
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Client otherClient = (Client) obj;
        return clientId == otherClient.clientId;
    }

    // Overriding hashCode() to provide a hash based on unique clientId
    @Override
    public int hashCode() {
        return Integer.hashCode(clientId);
    }
}