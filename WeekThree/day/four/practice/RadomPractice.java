package day.four.practice;

public class RadomPractice {
	//Write a program that generate a random number 
			// between 0 - 500 and if the random number is odd convert it to negative number,
			// and print the output. 
	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 500);
		
		if (number % 2 == 1) {
			int negative = number * -1;
			System.out.println(negative);
		}else {
			System.out.println(number);
		}
	}
}
