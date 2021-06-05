package practiceActivity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PracticeActivity7App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		Coach theCoach = context.getBean("bicycleCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}
