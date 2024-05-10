package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControoler {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }


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
