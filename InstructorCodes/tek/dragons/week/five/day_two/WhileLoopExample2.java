package tek.dragons.week.five.day_two;

import java.util.Scanner;

public class WhileLoopExample2 {
	public static void main(String[] args) {
		//Continue asking user input until user input 50 or greater;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		while(number < 50) {
			System.out.println("Enter a number");
			number = scanner.nextInt();
		}
		
		scanner.close();
		System.out.println("user input 50 or greater");
		scanner.close();
	}
}
