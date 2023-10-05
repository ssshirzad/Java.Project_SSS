package day.two;

import java.util.Scanner;

public class Activity5a {
	//Create an array that store 3 number. 
	// Using Scanner assign values from user input. 
	// then find the total of the values. 
	public static void main(String[] args) {
		double[] numbers = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		numbers[0] = scanner.nextDouble(); 
		numbers[1] = scanner.nextDouble();
		numbers[2] = scanner.nextDouble();
		scanner.close();
		double total = numbers[0] + numbers[1] + numbers[2];
		System.out.println("Total is " + total);
	}
}
