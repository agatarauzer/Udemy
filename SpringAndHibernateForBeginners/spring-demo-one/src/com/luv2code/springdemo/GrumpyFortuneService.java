package com.luv2code.springdemo;

import java.util.Random;

public class GrumpyFortuneService implements FortuneService {

	private String[] grumpyFortunes;
	
	public GrumpyFortuneService() {
		grumpyFortunes = new String[3];
		grumpyFortunes[0] = "Today not everything might go right...";
		grumpyFortunes[1] = "Sometimes happens something to complain about";
		grumpyFortunes[2] = "Bad things happen";
	}

	@Override
	public String getFortune() {
		return grumpyFortunes[new Random().nextInt(grumpyFortunes.length)];
	}

}
