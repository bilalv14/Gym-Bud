/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.jpacruddemo.Controller;

import com.csc340.jpacruddemo.Service.UsersService;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public ModelAndView showLoginPage() {
        return new ModelAndView("homePages/index");
    }

    @PostMapping("/loginSuccess")
    public ResponseEntity<?> processLogin(@RequestParam String username, @RequestParam String password) {
        boolean loginSuccessful = usersService.login(username, password);
        if (loginSuccessful) {
            return ResponseEntity.ok(Collections.singletonMap("loginSuccessful", true));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Collections.singletonMap("loginSuccessful", false));
        }
    }
}
