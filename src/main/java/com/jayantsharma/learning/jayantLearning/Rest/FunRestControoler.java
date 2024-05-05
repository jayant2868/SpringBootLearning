package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControoler {

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!!e";
    }
    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Workout";
    }
    @GetMapping("/fortune")
    public String getDailyFortune()
    {
        return "Fortune";
    }

}
