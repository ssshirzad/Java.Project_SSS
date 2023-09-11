package day.four.practice;

import java.util.Scanner;

public class Activity {
	// write a program to take a given number
	// and output if number is positive, negative or zero
	// 10 minutes
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		if(number > 0) {
			System.out.println(number + " Positive");
		}else if(number < 0) {
			System.out.println(number + " is Negative");
		}else {
			System.out.println(number + " is Zero");
			scan.close();
		}
	}

}
