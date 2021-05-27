package com.luv2code.springdemo;

public class ValleyballCoach implements Coach {

	private FortuneService fortuneService;
	
	public ValleyballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public ValleyballCoach( ) {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1,5 hour on training";
	}

	@Override
	public String getDailyFortune() {
		return "Just saying: " + fortuneService.getFortune();
	}	
}
