package tek.dragons.week.four.review;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		//lets get player name 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What's you name:");
		String name = scanner.next();
		
		//Pick a random number 0 - 100; 
		int random = (int) (Math.random() * 100); 
		
		boolean successFlag = false; 
		//create a loop and ask play guess for 10 time. 
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("This is your " + i + " try guess a number");
			int guess = scanner.nextInt();
			if (guess == random) {
				System.out.println("Congrats you find it");
				System.out.println("The number is " + random);
				//breaking a loop -> 
				successFlag = true; 
				break;
			}else if (guess < random) {
				System.out.println("guess higher number");
				successFlag = false; 
			}else if (guess > random) {
				System.out.println("guess lower number");
				successFlag = false; 
			}
		}
		scanner.close();
		//code for success or failure
		if (successFlag == true) {
			System.out.println(name + " you win");
		}else {
			System.out.println(name + " you failed");
		}
	}
}
