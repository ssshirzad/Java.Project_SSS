package day.two;

import java.util.Scanner;

public class Input {
	private Scanner scanner;
	
	public Input() {
		this.scanner = new Scanner(System.in);
	}
	public String getText(String prompt) {
		System.out.println(prompt);
		String input = scanner.next();
		return input;
	}
	public int getAge(String prompt) {
		System.out.println(prompt);
		int input = scanner.nextInt();
		return input;
	}
	public double getWeight(String prompt) {
		System.out.println(prompt);
		double input = scanner.nextDouble();
		return input;
	}

	}
	



