package day.three.practice;

import java.util.Scanner;

public class Activity1 {
	// create a program that take 3 integer number
	// and determine which one is greater.
	// 10 Minute
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("Enter third number");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Num1 is greater: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("num2 is greater "+ num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("num3 is greater "+ num3);
		}else {
			System.out.println("All numbers are equal");

		}
		scan.close();
	}

}
