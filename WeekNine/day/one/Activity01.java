package day.one;

public class Activity01 {
	// Create an Array that storing 5 numbers and try to assign any number
		// and print the numbers 1 by 1;
		public static void main(String[] args) {
			int[] numbers = new int[5];
			
			numbers[0] = 10; 
			numbers[1] = 11; 
			numbers[2] = 12; 
			numbers[3] = 13; 
			numbers[4] = 15;
		
			System.out.println("Length of the array " + numbers.length);
			
			for (int i= 0; i < numbers.length ; i++) {
				System.out.println(numbers[i]);
			}
			
			//Delete value in index 3; 
			numbers[3] = 0;
			
		}
}
