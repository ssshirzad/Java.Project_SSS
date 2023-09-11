package day.four;

import java.util.Scanner;

public class Activity1Practice {
	public static void main(String[] args) {
		
		// create a program that take 3 integer number
		// and determine which one is greater.
		// 10 Minute
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Integer");
		int number1 = scan.nextInt();
		System.out.println("Enter Second integer");
		int number2 = scan.nextInt();
		System.out.println("Enter third number");
		int number3 = scan.nextInt();
		
		int sum = 0;
		sum+=number1;
		sum+=number2;
		sum+=number3;
		if(number1 > number2 && number1 > number3) {
			System.out.println("First input: " +number1 + " is Greater");
			
		}else if (number2 > number1 && number2 > number2) {
			System.out.println("Second input: " +number2 + " is greater");
			
		}else if (number3 > number1 && number3 > number2) {
			System.out.println("Third input: " + number3 + " is greater");
			
		}else {
			System.out.println("Numbers are equal");
		}
		System.out.println("Sum of the numbers enter = " + sum);
		scan.close();
		}
		
		
	}


