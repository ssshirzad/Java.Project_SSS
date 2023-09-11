package day.two.practice;

import java.util.Scanner;

public class Activity5A {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers to asign to Array");
		int[] numbers = new int[3];
		
		numbers[0] = scan.nextInt();
		numbers[1] = scan.nextInt();
		numbers[2] = scan.nextInt();
		
		int total = 0;
		
		for(int nums: numbers) {
			total += numbers[nums];
			System.out.println("Total using while loop "+ total);
			scan.close();
		}
		
	}

	
}
