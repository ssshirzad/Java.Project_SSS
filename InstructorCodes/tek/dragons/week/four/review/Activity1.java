package tek.dragons.week.four.review;

import java.util.Scanner;

public class Activity1 {
	// create a program that take 3 integer number
	// and determine which one is greater.
	// 10 Minute
	public static void main(String[] args) {
		// Take 3 Numbers from Scanner.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scanner.nextInt();
		System.out.println("Enter Second number:");
		int second = scanner.nextInt();
		System.out.println("Enter Third number:");
		int third = scanner.nextInt();
		scanner.close();

		if (first > second && first > third) {
			System.out.println("First Number " + first + " is Greater");
		} else if (second > first && second > third) {
			System.out.println("Second Number " + second + " is Greater");
		} else if (third > first && third > second) {
			System.out.println("Third Number " + third + " is Greater");
		} else {
			System.out.println("Numbers are equal");
		}
	}
}
