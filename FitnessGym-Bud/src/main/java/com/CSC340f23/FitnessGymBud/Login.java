/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CSC340f23.FitnessGymBud;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author bilal
 */
public class Login {
    private Map<String, User> users = new HashMap<>();
    private Random random = new Random();

    public void addUser(String username, String password, String name, String role) {
        int id = generateRandomId();
        User newUser = new User(username, password, name, role, id);
        users.put(username, newUser);
    }

    public boolean loginUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }              

    public User getUserByUsername(String username) {
        return users.get(username);
    }

    public boolean isAdmin(String username) {
        User user = users.get(username);
        return user != null && "admin".equals(user.getRole());
    }

    private int generateRandomId() {
        // Generates a random ID between 1000 and 9999 for clients and trainers
        return random.nextInt(9000) + 1000;
    }
}
