package com.jayantsharma.learning.jayantLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// As we moved the two classes Coach.java and cricket coach in a package outside the jayantlearning, thus it was not able to find it
// So inorder to make sure springboot scans all the package, we explicity define the pakages.

@SpringBootApplication(
	scanBasePackages = {
		"com.jayantsharma.learning.jayantLearning",
		"com.jayantsharma.learning.Util"
	}
)
public class JayantLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JayantLearningApplication.class, args);
	}

}
