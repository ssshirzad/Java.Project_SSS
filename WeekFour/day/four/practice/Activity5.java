package day.four.practice;

import java.util.Scanner;

public class Activity5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name to play");
		String name = scan.next();
		int random = (int) (Math.random()*100);
		System.out.println(random);
		boolean successFlag = false;
		for (int i = 0; i <=5; i++) {
			int guess = scan.nextInt();
			
		if(guess == random) {
			System.out.println("Congrats!! You win");
			successFlag = true;
			break;
		}else if(guess < random) {
			System.out.println("Guess higher");
			successFlag = false;
		}else if(guess > random) {
			System.out.println("Guess lower");
			successFlag = false;
		}else {
			System.out.println("Try Again");
		}
		}
		if (successFlag == true) {
			System.out.println(name + " You're a good guesser");
	}else {
		System.out.println(name +" Maybe try agian later");
	}

}
}
