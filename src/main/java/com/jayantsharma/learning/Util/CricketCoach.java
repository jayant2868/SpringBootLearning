package com.jayantsharma.learning.Util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Componet Annotation marks the class as a Spring bean
@Component
// by default the bean scope will be singleton when not defined explicilty
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach
{
    public  String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes.";
    }
}
