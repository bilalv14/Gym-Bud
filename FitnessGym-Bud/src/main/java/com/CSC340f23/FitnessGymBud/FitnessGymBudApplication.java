package com.CSC340f23.FitnessGymBud;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FitnessGymBudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessGymBudApplication.class, args);

        Login loginSystem = new Login();
        Scanner scanner = new Scanner(System.in);

        loginSystem.addUser("admin", "adminpassword", "Admin Name", "admin");
        loginSystem.addUser("trainer1", "trainerpassword", "Trainer 1", "trainer");
        loginSystem.addUser("trainer2", "trainerpassword", "Trainer 2", "trainer");

        System.out.println("Welcome to the Fitness App!");

        while (true) {
            System.out.println("\n1. Create a new user");
            System.out.println("2. Login");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter role (admin/trainer/member): ");
                    String role = scanner.nextLine();

                    if ("admin".equals(role) && !password.equals("adminpassword")) {
                        System.out.println("Invalid admin password.");
                        break;
                    } else if ("trainer".equals(role) && !password.equals("trainerpassword")) {
                        System.out.println("Invalid trainer password.");
                        break;
                    } else {
                        loginSystem.addUser(username, password, name, role);
                        System.out.println("User created successfully!");
                    }
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();

                    if (loginSystem.loginUser(username, password)) {
                        User user = loginSystem.getUserByUsername(username);
                        if (user != null) {
                            if ("admin".equals(user.getRole()) && "adminpassword".equals(password)) {
                                System.out.println("Welcome, Gym Admin!");
                            } else if ("trainer".equals(user.getRole()) && "trainerpassword".equals(password)) {
                                System.out.println("Welcome, Trainer: " + user.getName() + " ID: " + user.getId());
                            } else {
                                System.out.println("Welcome, " + user.getRole() + ": " + user.getName());
                            }
                        }
                    } else {
                        System.out.println("Login failed. Please check your credentials.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
