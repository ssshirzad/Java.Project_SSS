package ReplitMarketSupport;

import java.util.Scanner;

public class PayramidOfStars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows of stars would you like? ");

		int rows = scanner.nextInt();
		
//		int rows = 5;
		
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
