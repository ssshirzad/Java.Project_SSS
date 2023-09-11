package day.three;

public class Activity8 {
	public static void main(String[] args) {
		
		int[] numbers = {10 , 13 , 15 , 17 , 21 , 22 , 26 , 74 , 34 , 25 , 37 };
		
		double sumOdd = 0;
		double sumEven = 0;
		
		for (int index = 0; index < numbers.length; index ++) {
			
			if (numbers[index] % 2 == 0) {
				sumEven += numbers[index];	
			}else {
				sumOdd += numbers[index];
			}
		}
		
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
