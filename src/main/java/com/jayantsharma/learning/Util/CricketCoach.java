package com.jayantsharma.learning.Util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.val;

//@Componet Annotation marks the class as a Spring bean
@Component

public class CricketCoach implements Coach
{

    // define our init method
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("in doMyStartupStuff(): " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMycleanupStuff()
    {
        System.out.println("in doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    public  String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes.";
    }
}
