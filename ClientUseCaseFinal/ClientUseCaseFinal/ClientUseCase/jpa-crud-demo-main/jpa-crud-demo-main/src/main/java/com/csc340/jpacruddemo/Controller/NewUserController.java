/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import com.csc340.jpacruddemo.Entity.NewUser;
import com.csc340.jpacruddemo.Service.NewUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author bilalzahid
 */
@Controller
@RequestMapping("/user")
public class NewUserController {

    @Autowired
    private NewUserService service;

    @GetMapping("/signup")
    public ModelAndView showSignUpPage() {
        return new ModelAndView("homePages/signup");
    }

    @PostMapping("/create")
    public String createUser(NewUser user) {
        service.saveUser(user);
        return "redirect:/user/login";
    }
    
        @GetMapping("/remove_Clients")
    public String getGymMemberUsers(Model model) {
        List<NewUser> gymMemberUsers = service.getUsersByType("gym_member");
        model.addAttribute("gymMemberUsers", gymMemberUsers);
        return "trainerPages/Remove_Client";
    }
    

    @GetMapping("/delete/id={userId}")
    public String userProduct(@PathVariable long userId, Model model) {
        service.deleteUser(userId);
        return "redirect:/trainerPages/Remove_Client";
    }
}
