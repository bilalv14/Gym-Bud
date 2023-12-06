
package com.csc340.jpacruddemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author jakec
 */
@Controller
public class TrainerController {
    
     @GetMapping("/trainer")
    public String showTrainerPage() {
        return "trainerPages/trainer"; 
    }

    @GetMapping("/removeClients")
    public String removeClients() {
        return "trainerPages/remove_Client";
    }
    
    @GetMapping("/setSchedule")
    public String setSchedule() {
        return "trainerPages/set_Schedule";
    }
    
    @GetMapping("/trainersignOut")
    public String signOut() {
        // Perform any necessary sign-out logic
        return "user/login"; // Redirect to the index page after signing out
    }
}