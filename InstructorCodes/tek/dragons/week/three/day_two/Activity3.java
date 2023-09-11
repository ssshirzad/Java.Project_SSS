package tek.dragons.week.three.day_two;

public class Activity3 {
	// write a program that take 2 different number
	// and out put which one is greater.
	// 5 minute
	public static void main(String[] args) {
		int firstNumber = 50;
		int secondNumber = 20;

		if (firstNumber > secondNumber) {
			System.out.println(firstNumber + " is greater than " + secondNumber);
		} else if (secondNumber > firstNumber) {
			System.out.println(secondNumber + " is greater than " + firstNumber);
		} else {
			System.out.println(firstNumber + " is equals to " + secondNumber);
		}
	}
}
