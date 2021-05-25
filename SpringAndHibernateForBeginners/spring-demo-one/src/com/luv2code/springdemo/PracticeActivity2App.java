package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
Practice Activity #2 - Dependency Injection with XML Configuration
1. Define a new implementation for the FortuneService.
    a. When the getFortune() method is called it should return a random fortune from the array.
    b. Your fortune service should define three fortunes in an array. 
2. Inject your new dependency into your Coach implementation.
3. Test your application to verify you are retrieving random fortunes.
*/

public class PracticeActivity2App {
public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		ValleyballCoach myVolleyballCoach = context.getBean("myVolleyballCoach", ValleyballCoach.class);
		
		//call methods on the bean
		System.out.println(myVolleyballCoach.getDailyWorkout());
		System.out.println(myVolleyballCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
