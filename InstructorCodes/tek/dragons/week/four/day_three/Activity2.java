package tek.dragons.week.four.day_three;

import java.util.Scanner;

public class Activity2 {
	// ask user the length of array of Integer
	// create an array for that length 
	// then Ask user to input numbers 
	// and then find the sum of the numbers. 
	// 20 Minute
	
	public static void main(String[] args) {
		// get the length of array from User. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scanner.nextInt();
		//create an array with given length
		int[] numbers = new int[length];
		
		//Assign number into the array 
		for (int index = 0 ; index < length ; index ++) {
			System.out.println("Enter a Integer number");
			numbers[index] = scanner.nextInt();
		}
		
		scanner.close();
		int sum = 0; 
		for (int index = 0 ; index < numbers.length ; index++) {
			sum += numbers[index];
		}
		System.out.println("sum is " + sum);
		
	}
}
