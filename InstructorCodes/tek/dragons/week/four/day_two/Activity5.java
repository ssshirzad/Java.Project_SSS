package tek.dragons.week.four.day_two;

public class Activity5 {
	// write program that output the total value between 0 - 100;
	
	public static void main(String[] args) {
		//initial sumOfNumbers 
		int sumOfNumbers = 0; 
		for (int number = 0; number <= 500 ; number++) {
			sumOfNumbers += number;
		}
		
		System.out.println("Sum of numbers between 0 - 100 = " + sumOfNumbers);
	}
}
