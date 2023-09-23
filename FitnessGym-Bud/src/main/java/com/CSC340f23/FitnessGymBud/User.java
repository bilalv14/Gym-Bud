/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CSC340f23.FitnessGymBud;

/**
 *
 * @author bilal
 */
public class User {
    private String username;
    private String password;
    private String name;
    private String role;
    private int id;

    public User(String username, String password, String name, String role, int id) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }
}
