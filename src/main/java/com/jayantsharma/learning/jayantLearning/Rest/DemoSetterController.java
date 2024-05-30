package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayantsharma.learning.Util.Coach;

@RestController
public class DemoSetterController {

    private Coach myCoach;

    // setter injection
    @Autowired
    public void setCoach(@Qualifier("tennisCoach")Coach theCoach) // look at the naming, the first letter of the classname inside qualifier should be small case.
    {
        myCoach = theCoach;
    }

    @GetMapping("/Demo/getDailyWorkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }

}
