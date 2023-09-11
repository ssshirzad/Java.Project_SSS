package day.three.practice;

public class Activity8 {
	public static void main(String[] args) {
		int[] numbers = { 10 , 13 , 15 , 17 , 21 , 22 , 26 , 74 , 34 , 25 , 37 };
		//find the sum of odd number and sum of even numbers. 
		
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sumEven += numbers[i];
			}else if(numbers[i] % 2 == 1) {
				sumOdd += numbers[i];
			}
		}
		System.out.println("SumEven: "+ sumEven);
		System.out.println("SumOdd: "+ sumOdd);
	}

}
