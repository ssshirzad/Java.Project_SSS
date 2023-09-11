package day.one;

import java.util.Scanner;

public class CalculatorActivity {
	// Creating Simple Calculator.
	// first ask user to enter first number then second number.
	// then ask user to enter operator + - * / %
	// then calculate base on the operator.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		double first = scanner.nextDouble();
		System.out.println("Enter any number");
		double second = scanner.nextDouble();
		System.out.println("Choose an Operator  + , - , * , / , %");
		String operator = scanner.next();
		// Based on Operator choose the action.
		double result = 0;
		switch (operator) {
		case "+":
			result = first + second;
			break;
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			result = first / second;
			break;
		case "%":
			result = first % second;
			break;
		default:
			System.out.println("Wrong Operator");
			break;
		}

		System.out.println(first + operator + second + " = " + result);
		scanner.close();
	}
}
