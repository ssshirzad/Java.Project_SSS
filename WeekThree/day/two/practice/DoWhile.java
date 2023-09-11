package day.two.practice;

import java.util.Scanner;

public class DoWhile {
	//Fill in the blank spaces to complete a java program that gets 
		//the input from user and prints the result
		//until the result is greater than 100.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an Integer");
		int userInput;
		do {
			userInput = scanner.nextInt();
			System.out.println(userInput);
			if(userInput < 100 && userInput >0) {
				System.out.println("Enter an Int to continue");
			}
			else if(userInput < 0) {
				System.out.println("You've entered a number less than zero");
			}
		}while (userInput < 100 && userInput > 0); 
		scanner.close();
		}
	
	}


