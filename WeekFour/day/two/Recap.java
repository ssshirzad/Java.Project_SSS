package day.two;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		//create a new object of Scanner Class. 
		Scanner scanner = new Scanner(System.in);
		
		// get String
		String text = scanner.next();
		//int input
		int integerInput = scanner.nextInt();
		System.out.println(integerInput);
		
		// double input 
		double doubleValue = scanner.nextDouble();
		System.out.println(doubleValue);
		
		System.out.println("The text is " + text);
		scanner.close();
	}

}
