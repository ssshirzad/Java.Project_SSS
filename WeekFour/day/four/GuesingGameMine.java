package day.four;

import java.util.Scanner;

public class GuesingGameMine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.next();
		int random = (int) (Math.random()*100);
		System.out.println(random);
		
		boolean successFlag = false;
		
		for (int i=0; i<+5;i++) {
			System.out.println("Guess a number between 1-100");
			int guess = scan.nextInt();	
		if (guess == random) {
			System.out.println("Congrats!!! You're a good guesser");
			successFlag = true;
			break;
		}else if (guess < random) {
			System.out.println("Maybe try bigger number");
			successFlag = false;
		}else if (guess > random) {
			System.out.println("Maybe try smaller number");
			successFlag = false;
		}else {
			System.out.println("Thans for playing. Try Again");
		}
			}
	if (successFlag == true) {
		System.out.println(name + " : You've won this game");
	}else {
		System.out.println(name + " : You've lost this one");
		scan.close();
	}
		
	}

}
