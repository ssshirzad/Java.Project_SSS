package tek.dragons.week.five.day_two;

import java.util.Scanner;

public class WhileLoopExample {
	//Building a calculator that adding numbers until user input = sign. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String operator = "";
		
		int result = 0; 
		//String not equals ! mean NOT
		while(!operator.equals("=")) {
			System.out.println("Enter a number");
			int first = scanner.nextInt(); 
			System.out.println("Enter another number");
			int second = scanner.nextInt();
			System.out.println("Adding Numbers");
			
			result += first + second;
			System.out.println("If Done enter = sign otherwise hit enter");
			operator = scanner.next();
		}
		
		System.out.println("result " + result);
		scanner.close();
	}
}
