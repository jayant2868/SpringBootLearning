package com.jayantsharma.learning.jayantLearning;

import org.springframework.stereotype.Component;

//@Componet Annotation marks the class as a Spring bean
@Component
public class CricketCoach implements Coach
{
    public  String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes.";
    }
}
