package day.three;

import java.util.Scanner;

public class UserInputArrayLenght {
	public static void main(String[] args) {
		
		// ask user the length of array of Integer
		// create an array for that length 
		// then Ask user to input numbers 
		// and then find the sum of the numbers. 
		// 20 Minute
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Lenght");
		
		int lenght = scan.nextInt();
		
		int[] numbers = new int[lenght];
		
		System.out.println("Please enter numbers for the lenght provided");
		
		for (int i=0; i<lenght; i++) {
			numbers[i] = scan.nextInt();	
		}
		int sum = 0;
		for (int i=0; i<lenght; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum of numbers = " +sum);
		scan.close();
	}

}
