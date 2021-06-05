package practiceActivity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfiguration {
	
	@Bean
	public FortuneService badDayFortuneService() {
		return (FortuneService) new BadDayFortuneService();
	}
	
	@Bean
	public Coach bicycleCoach() {
		return new BicycleCoach(badDayFortuneService());
	}
}
