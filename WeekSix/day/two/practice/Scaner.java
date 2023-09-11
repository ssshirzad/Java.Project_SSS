package day.two.practice;

import java.util.Scanner;

public class Scaner {
	
	
	public Scanner Scanner;
	
	public Scaner() {
		this.Scanner = new Scanner(System.in);
	}
	
	public String getNameInput(String prompt) {
		System.out.println(prompt);
		String name = Scanner.next();
		return name;
	}
	public int getAgeInput(String prompt) {
		System.out.println(prompt);
		int age = Scanner.nextInt();
		return age;
	}
	public String getReligionInput(String prompt) {
		System.out.println(prompt);
		String religion = Scanner.next();
		return religion;
	}

}
