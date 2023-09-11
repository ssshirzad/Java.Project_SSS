package day.three.practice;

public class Activity6 {

	public static void main(String[] args) {
		double[] numbers = {10.21, 13.41, 15.32, 65.12 , 15.24 , 26.35, 98.35};
		//find the sum of all the number in this array. 
		double sum = 0; 
		// index are incrementing 
		// always start from 0; 
		// end on last index --> length - 1 ; 
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum of Number: "+ sum);
		
	}

}
