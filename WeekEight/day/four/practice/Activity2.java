package day.four.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity2 {
	
	// Create a program which will do following.
	// 1) have an array of double number with length user want.
	// 2) get input from user and assign into the array
	// 3) output the sum of numbers in the array
	// declare a double array with given length
	// lets get values from user
	
	// I need a Scanner for user input
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = 0;
		try {
		length = Scan.nextInt();
		}catch (InputMismatchException ex) {
			System.out.println("Wrong entry");
		}
		double sum = 0;
		// Need to declare a double array of numbers
		int[] numbers = new int[length];
		
		
		for (int i = 0; i < numbers.length; i++) {
			Scan.nextInt();
			System.out.println("Enter int to add to array");
			numbers[i] = Scan.nextInt();
			
			for (double number: numbers) {
				sum+=number;
				
			}
			System.out.println(sum);
		Scan.close();
		}
		// Get input from user and assign to array
		// Print sum of the numbers user inserted 
	}


}
