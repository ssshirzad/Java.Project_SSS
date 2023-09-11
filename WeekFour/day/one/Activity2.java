package day.one;

import java.util.Scanner;

public class Activity2 {
	// Activity
	// Ask user first name
	// then ask user last name.
	// then print full name
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First name");
		String firstName = scanner.next();
		
		System.out.println("Enter last name");
		String lastName = scanner.next();
		
		String fullName = firstName + " " + lastName; 
		System.out.println(fullName);
		scanner.close();
	}
}
