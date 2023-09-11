package day.three.practice;

public class Activity5 {
	// write program that output the total value between 0 - 100;
	public static void main(String[] args) {
		
		int sumOfLoop = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfLoop += i;
		}
		System.out.println("Sum of loop: "+ sumOfLoop);
	}

}
