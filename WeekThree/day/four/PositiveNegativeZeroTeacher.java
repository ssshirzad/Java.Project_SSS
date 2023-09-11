package day.four;

public class PositiveNegativeZeroTeacher {
	// write a program to take any given number
	// and output if number is positive, negative or zero?
	// 10 Minute
	public static void main(String[] args) {
		double number = 0;
		if (number > 0) {
			System.out.println("number " + number + " is positive");
		}else if (number < 0) {
			System.out.println("number " + number + " is negative");
		}else {
			System.out.println("number " + number + " is Zero");
		}
	}
}
