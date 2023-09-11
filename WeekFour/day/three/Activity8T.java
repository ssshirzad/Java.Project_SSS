package day.three;

public class Activity8T {
	public static void main(String[] args) {
		int[] numbers = { 10 , 13 , 15 , 17 , 21 , 22 , 26 , 74 , 34 , 25 , 37 };
		//find the sum of odd number and sum of even numbers. 
		int sumEven = 0; 
		int sumOdd = 0; 
		
		for(int index = 0 ; index < numbers.length ; index ++) {
			if (numbers[index] % 2 == 0 ) {
				sumEven += numbers[index];
			} else {
				sumOdd += numbers[index];
			}
		}
		
		System.out.println("Sum of Odd numbers " + sumOdd);
		System.out.println("Sum of even numbers " + sumEven);
	}
}
