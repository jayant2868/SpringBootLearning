package com.jayantsharma.learning.Util;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        
        return "Spend 30 minutes in batting practice.";
    }

}
