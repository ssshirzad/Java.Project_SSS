package day.one.practice;

import java.util.Scanner;

public class Activity3 {
	// Activity 3
		// Ask user for an Integer number.
		// then check if that number is odd or even.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println(number + " Is Even");
		}else {
			System.out.println(number + " Is Odd");
			scan.close();
		}
	}

}
