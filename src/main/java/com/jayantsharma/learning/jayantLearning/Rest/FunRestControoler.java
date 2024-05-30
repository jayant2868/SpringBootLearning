package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayantsharma.learning.Util.Coach;

@RestController
public class FunRestControoler {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //define a private field for the dependency.
    private Coach myCoach;

    //define a constructor for dependency injection.
    //@Autowired tells the Spring to inject a dependency, also if you have only one constructor the @Autowired on constructor is optional.
    @Autowired
    public FunRestControoler(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkouts()
    {
        return myCoach.getDailyWorkout();
    }

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
