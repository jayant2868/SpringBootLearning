package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayantsharma.learning.Util.Coach;

@RestController
public class DemoSetterController {

    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/Demo/getDailyWorkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

}
