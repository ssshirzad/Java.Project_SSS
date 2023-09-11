package day.one.practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		// Creating Simple Calculator.
		// first ask user to enter first number then second number.
		// then ask user to enter operator + - * / %
		// then calculate base on the operator.

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Select your operator [ +, -, /, *, % ]");
		String operator = scan.next();

		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();

		int result = 0;

		if (operator.equals("+")) {
			result = firstNumber + secondNumber;
			System.out.println("Added Result = " + result);
		} else if (operator.equals("-")) {
			result = firstNumber - secondNumber;
			System.out.println("Subtracted Result = " + result);
		} else if (operator.equals("/")) {
			result = firstNumber / secondNumber;
			System.out.println("Devided Result = " + result);
		} else if (operator.equals("*")) {
			result = firstNumber * secondNumber;
			System.out.println("Multiplied Result =" + result);
		}else if(operator.equals("%")) {
			result = firstNumber % secondNumber;
			System.out.println("Remainder = "+ result);
		}
	
		System.out.println(firstNumber + operator + secondNumber + " = "+ result);
		scan.close();
			}
		}
	


