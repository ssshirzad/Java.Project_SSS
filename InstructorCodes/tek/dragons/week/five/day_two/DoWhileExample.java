package tek.dragons.week.five.day_two;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		// 1) Use Scanner to get input.
		Scanner scanner = new Scanner(System.in);
		// 2) generate random number between 0 - 100;
		int targetNumber = (int) (Math.random() * 100);
		int playerGuess = 0;
		do {
			System.out.println("Guess a number");
			playerGuess = scanner.nextInt();
			if (playerGuess == targetNumber) {
				System.out.println("You've guessed it.");
			}else if (playerGuess > targetNumber) {
				System.out.println("Go Lower");
			}else if (playerGuess < targetNumber) {
				System.out.println("Go higher");
			}
			
		}while(playerGuess != targetNumber);
		scanner.close();
	}
}
