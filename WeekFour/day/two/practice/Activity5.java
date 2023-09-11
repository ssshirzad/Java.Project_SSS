package day.two.practice;

import java.util.Scanner;

public class Activity5 {
	//Create an array that store 3 number. 
	// Using Scanner assign values from user input. 
	// then find the total of the values. 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers to asign to Array");
		int[] numbers = new int[3];
		
		numbers[0] = scan.nextInt();
		numbers[1] = scan.nextInt();
		numbers[2] = scan.nextInt();
		
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			total += numbers[i];
		}
		System.out.println("Total = "+ total);
		scan.close();
		
	}

}
