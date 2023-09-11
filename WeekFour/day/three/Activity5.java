package day.three;

public class Activity5 {
	// write program that output the total value between 0 - 100;
	
	public static void main(String[] args) {
		//initial sumOfNumbers 
		int sumOfNumbers = 0; 
		for (int number = 1; number <= 100 ; number++) {
			sumOfNumbers += number;
		}
		
		System.out.println("Sum of numbers between 0 - 100 = " + sumOfNumbers);
	}
}
