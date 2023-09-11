package tek.dragons.week.five.review;

import java.util.Scanner;

public class Activity2 {
	//Create a program that take 2 numbers
	// and will show result of power second number on first number. 
	// example =  2 * 2 * 2 = 8;
	// 2 * 2 = 4;
	// 4 * 2 = 8; 
	// 8 * 2 = 16; 
	// 16 * 2 = 32
	//Do NOT use Java Libraries for this question
	// 10 Minute
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base number");
		int base = scanner.nextInt();
		System.out.println("Enter Power number");
		int power = scanner.nextInt();
		//initial for multiplication. 
		long result = 1; 
		
		for (int i = 1; i<=power; i++) {
			result = result * base;
		}
		System.out.println("result " + result);
//		while(power >=1) {
//			result = result * base;
//			power --;
//		}
		scanner.close();
	}
}
