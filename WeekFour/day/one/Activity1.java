package day.one;

import java.util.Scanner;

public class Activity1 {
	// Activity
	// Ask user to input an integer number 
	// Ask user to input another integer number. 
	// add both number together and print the result. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer number");
		int first = scanner.nextInt();
		System.out.println("Enter Another Integer");
		int second = scanner.nextInt();
		
		int result = first + second; 
		System.out.println("Result is " + result);
		scanner.close();
	}
}
