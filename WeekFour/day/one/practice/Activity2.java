package day.one.practice;

import java.util.Scanner;

public class Activity2 {
	// Activity
			// Ask user first name
			// then ask user last name.
			// then print full name
			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		
		String nameOutput = firstName + " "+ lastName;
		System.out.println(nameOutput);
		scan.close();
	}
		

}
