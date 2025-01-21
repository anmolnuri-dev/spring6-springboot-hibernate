package com.anmol.learning.controller;


import com.anmol.learning.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    //Controller methods
    @GetMapping("/dailyworkout") //API endpoint
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
