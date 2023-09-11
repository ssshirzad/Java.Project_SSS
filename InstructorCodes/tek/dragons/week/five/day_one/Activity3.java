package tek.dragons.week.five.day_one;

import java.util.Scanner;

public class Activity3 {
	//Write a program to enter the numbers till the user wants to end. 
	//should display the count of positive, negative and zeros entered. 
	
	//15 minute
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//to store the counter
		int positiveCounter = 0; 
		int negativeCounter = 0; 
		int zeroCounter = 0; 
		//using do-while loop 
		char termination; 
		do {
			//first ask for number; 
			System.out.println("Enter a number");
			int number = scanner.nextInt();
			if (number > 0) {
				positiveCounter ++;
			}else if (number < 0) {
				negativeCounter ++;
			}else {
				zeroCounter ++;
			}
			System.out.println("Do you want to terminate? (y/n)");
			termination = scanner.next().charAt(0);
		}while(termination == 'n' || termination == 'N');
		
		System.out.println("Positive count " + positiveCounter);
		System.out.println("Negative count " + negativeCounter);
		System.out.println("Zero count " + zeroCounter);
		scanner.close();
	}
}
