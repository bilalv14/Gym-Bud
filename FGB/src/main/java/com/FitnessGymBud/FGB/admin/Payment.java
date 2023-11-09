
package com.FitnessGymBud.FGB.admin;

import com.FitnessGymBud.FGB.trainer.Trainer;
import java.util.Date;

/**
 *
 * @author kwaheed
 */
public class Payment {
    private double amount;
    private Date date;
    private Trainer recipient;

    // Constructor
    public Payment(double amount, Trainer recipient) {
        this.amount = amount;
        this.recipient = recipient;
        this.date = new Date();  // Capture the current date when the payment is made
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter for date
    public Date getDate() {
        return date;
    }

    // Getter for recipient
    public Trainer getRecipient() {
        return recipient;
    }

    // Setter for recipient
    public void setRecipient(Trainer recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Payment [Amount: $" + amount + ", Date: " + date + ", Recipient: " + recipient.getTrainerName() + "]";
    }

    // Overriding equals() based on unique attributes of a payment (for the sake of example, we'll consider amount and date)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Payment otherPayment = (Payment) obj;
        return amount == otherPayment.amount && date.equals(otherPayment.date);
    }

    // Overriding hashCode() based on unique attributes of a payment (amount and date)
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
