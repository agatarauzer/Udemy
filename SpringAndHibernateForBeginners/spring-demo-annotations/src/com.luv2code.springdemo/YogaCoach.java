package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice yoga for 30 minutes";
	}
}
