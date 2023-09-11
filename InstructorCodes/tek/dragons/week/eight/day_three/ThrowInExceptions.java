package tek.dragons.week.eight.day_three;

import java.util.Scanner;

public class ThrowInExceptions {
	//throw is keyword used part of the code to throw new Exception and stop execution. 
	//throw always required an exception from RuntimeException Family. 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		if (age > 21) {
			System.out.println("Eligible to drink");
		}else {
			throw new RuntimeException("You are under 21 years old.");
		}
		
		System.out.println("Code end in here.");
		scanner.close();
	}
}
