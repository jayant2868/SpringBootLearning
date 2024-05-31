package com.jayantsharma.learning.jayantLearning.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayantsharma.learning.Util.Coach;

@RestController
public class DemoSetterController {

    private Coach myCoach;

    private Coach coach1;

    private Coach coach2;

    @Autowired
    public DemoSetterController(
        @Qualifier("cricketCoach") Coach coach,
        @Qualifier("cricketCoach") Coach anotherCoach
    )
    {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        coach1 = coach;
        coach2 = anotherCoach;
    }

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
    /*
     * if the bean scope is singleton it will return true, which means only one bean or instance was created throughout the program
     * if the bean scope is prototype it will return false, which means different instance or bean was created for both the objects.
     */
    @GetMapping("/Demo/checkBeans")
    public String check()
    {
        return "Comparing beans: coach1 == coach2, " + (coach1 == coach2); 
    }

}
