package com.jayantsharma.learning.Util;

// not defining the component annotation, as we will configure it to work with java beans
public class SwimCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        
        return "Swim 5000 meters daily";
    }
    
}
