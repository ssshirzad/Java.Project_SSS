package day.two;

import java.util.Scanner;

public class ArrayScannerActivit {
	public static void main(String[] args) {
		
		//Create an array that store 3 number. 
		// Using Scanner assign values from user input. 
		// then find the total of the values. 
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		System.out.println("Enter first number");
		numbers[0] = scan.nextInt();
		System.out.println("Enter second number");
		numbers[1] = scan.nextInt();
		System.out.println("Enter third number");
		numbers[2] = scan.nextInt();
		
		int total = numbers[0] + numbers[1] + numbers[2];
		System.out.println("Your total is: " + total);
		scan.close();
	}

}
