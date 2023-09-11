package day.one.practice;

public class Activity {
	public static void main(String[] args) {
		
		// Variable population = 12345;
		// Variable kidGenderPercent = 35;
		// Calculate how many kids living in the town;
		// Return me whole number;
		
		int population = 12345;
		int childPercent = 35;
		
		double result = population * childPercent / 100;
		System.out.println(result);
		int resultCasted = (int) result;
		System.out.println(resultCasted);
		
		
	}

}
