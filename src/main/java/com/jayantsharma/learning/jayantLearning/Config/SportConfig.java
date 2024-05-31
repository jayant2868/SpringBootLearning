package com.jayantsharma.learning.jayantLearning.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jayantsharma.learning.Util.SwimCoach;

@Configuration
public class SportConfig {

    // if the bean id is not provided, it takes the method name as the default bean id
    @Bean("randomBeanId")
    public SwimCoach swimCoach()
    {
        return new SwimCoach();
    }
}
