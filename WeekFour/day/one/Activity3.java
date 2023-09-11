package day.one;

import java.util.Scanner;

public class Activity3 {
	// Activity 3
	// Ask user for an Integer number.
	// then check if that number is odd or even.
	public static void main(String[] args) {
		// get input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer number");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
		scanner.close();
	}
}
