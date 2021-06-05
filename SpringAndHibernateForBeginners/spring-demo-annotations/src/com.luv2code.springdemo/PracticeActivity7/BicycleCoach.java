package practiceActivity7;


public class BicycleCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BicycleCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ride a 20 km today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
