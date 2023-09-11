package day.two.practice;

public class Activity {
	// Activity
			// declare variable and assign value 24.54; first
			// declare variable and assign value 5; second.
			// check and print first is greater than second 
			// check and print first is less than second 
			// check and print first is greater/Equal than second 
			// check and print first is less/Equal than second 
			// check and print first is equal second 
			// check and print first is not equal than second
	
	public static void main (String[] args) {
		
		double num = 24.54;
		int num2 = 5;
		
		boolean isGreater = num > num2;
		System.out.println(isGreater);
		
		boolean isLess = num < num2;
		System.out.println(isLess);
		
		boolean isGreaterEqual = num >= num2;
		System.out.println(isGreaterEqual);
		
		boolean isLessEqual = num <= num2;
		System.out.println(isLessEqual);
		
		boolean isEqual = num == num2;
		System.out.println(isEqual);
		
		boolean isNotEqual = num != num2;
		System.out.println(isNotEqual);
	}
}
