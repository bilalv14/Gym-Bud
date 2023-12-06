/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author bilal
 */
@Controller
public class GymMemberController {

    @GetMapping("/gymMember")
    public String showGymMemberPage() {
        return "clientPages/gymMember"; 
    }

    @GetMapping("/signOut")
    public String signOut() {
        // Perform any necessary sign-out logic
        return "user/login"; // Redirect to the index page after signing out
    }
}
