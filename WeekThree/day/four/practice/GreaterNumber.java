package day.four.practice;

import java.util.Scanner;

public class GreaterNumber {
	// write a program that take 2 different number
		// and out put which one is greater.
		// 5 minute
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if(number1 > number2) {
			System.out.println(number1 + " is greater than "+ number2);
		}else if(number2 > number1) {
			System.out.println(number2 + " is greater than "+ number1);
			scan.close();
		}
	}

}
