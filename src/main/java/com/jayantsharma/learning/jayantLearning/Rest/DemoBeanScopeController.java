package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.jayantsharma.learning.Util.Coach;

@RestController
public class DemoBeanScopeController {

    private Coach myCoach1;

    @Autowired
    public DemoBeanScopeController(
        @Qualifier("cricketCoach") Coach theCoach
        )
    {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach1 = theCoach;
    }
}
