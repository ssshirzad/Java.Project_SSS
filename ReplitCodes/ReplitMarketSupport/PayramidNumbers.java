package ReplitMarketSupport;

import java.util.Scanner;

public class PayramidNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows would you like");
		int rows = scanner.nextInt();
		
		printNumberParamid(rows);
	}
	
	private static void printNumberParamid(int rows) {
		int currentCount = 1;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(currentCount + ' ');
				currentCount++;
			}
			System.out.println();
		}
	}

}
