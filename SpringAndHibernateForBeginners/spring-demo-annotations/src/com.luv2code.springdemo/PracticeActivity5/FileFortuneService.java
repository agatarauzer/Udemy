package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;


@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "fortunes.txt";
	private List<String> fortunes;
	
	public FileFortuneService() {
		fortunes = new ArrayList<>();
	}
	
	@Override
	public String getFortune() {
		writeLinesIntoFile();
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}
	
	private void writeLinesIntoFile() {
		try {
			File text = new File(fileName);
			Scanner scan = new Scanner(text);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				fortunes.add(line);
	        }
			scan.close();
		}
		catch (FileNotFoundException e) {
			 System.out.println("An error occurred.");
		}
	}
}
