/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import com.csc340.jpacruddemo.Entity.Feedback;

import com.csc340.jpacruddemo.Service.FeedbackService;
import com.csc340.jpacruddemo.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author bilalzahid
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private UsersService UsersService;

    @PostMapping("/submit")
    public String submitFeedback(@RequestParam("message") String message,
                                                @RequestParam("username") String username) {
        // Create a Feedback object
        Feedback feedback = new Feedback(message, username);

        // Save the feedback
        feedbackService.saveFeedback(feedback);

       
        return "ClientPages/GymMember.html";
    }
}
