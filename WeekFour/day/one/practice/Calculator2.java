package day.one.practice;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
		System.out.println("Select your operator");
		String operator = scan.next();
		
		int result = 0;
		switch(operator) {
		case "+":
			result = firstNumber + secondNumber;
			System.out.println("Added Result = "+ result);
			break;
		case "-":
			result = firstNumber - secondNumber;
			System.out.println("Subtracted Result = "+ result);
			break;
		case "/":
			result = firstNumber / secondNumber;
			System.out.println("Divided Result = "+ result);
			break;
		case "*":
			result = firstNumber * secondNumber;
			System.out.println("Multiplied Result = "+ result);
			break;
		case "%":
			result = firstNumber % secondNumber;
			System.out.println("Remainder = "+ result);
		}
		System.out.println(firstNumber+ operator+ secondNumber+" = "+ result);
		scan.close();
	}

}
