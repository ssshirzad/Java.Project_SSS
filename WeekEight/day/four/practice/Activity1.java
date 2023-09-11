package day.four.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity1 {
	
	public static void main(String[] args) {
		// Create a program which will do following.
		// 1) have an array of double number with length user want.
		// 2) get input from user and assign into the array
		// 3) output the sum of numbers in the array
		// declare a double array with given length
		// lets get values from user
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array");
		
		int length = 0;
		try {
		length = scanner.nextInt();
		}catch (InputMismatchException ex) {
			System.out.println("Wrong Input");
			System.out.println("Can't continue");
			scanner.close();
			throw new RuntimeException("Can't continue"); 
		}
		//declare a double array with given length
		
		double[] numbers = new double[length];
		
		// lets get values from user
		for (int i = 0; i < numbers.length; i ++) {
			System.out.println("Enter " + (i+1) + " Number");
			scanner = new Scanner(System.in);
			try {
			numbers[i] = scanner.nextDouble();
			}catch (InputMismatchException exception) {
				System.out.println("Wrong Input");
			}
		}
		
		double total = 0;
		
		for (double number: numbers) {
			total += number;
		}
		System.out.println("Total of numbers is : " + total);
		scanner.close();
	}

}
