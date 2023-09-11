package ReplitMarketSupport;

import java.util.Scanner;

public class PayramidOfStarsInverted {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("How many rows of stars would you like? ");
//
//		int rows = scanner.nextInt();
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
