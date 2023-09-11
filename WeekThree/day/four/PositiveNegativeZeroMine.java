package day.four;

public class PositiveNegativeZeroMine {
	public static void main(String[] args) {
		// write a program to take a given number
		// and output if number is positive, negative or zero
		// 10 minutes
		
		int number = 0;
		
		if (number < 0) {
			System.out.println("Number Negative");
		}else if (number > 0) {
			System.out.println("Number Positive");
		}else {
			System.out.println("Number Zero");
			
			// Instructor
			double value = 19.2; // change these around
			if (value > 0) {
				System.out.println("number " + number + " is positive");
			}else if (value < 0) {
				System.out.println("number" + number + "is negative");
			}else {
				System.out.println("number" + number + "is Zero");
			}
		}
	}

}
