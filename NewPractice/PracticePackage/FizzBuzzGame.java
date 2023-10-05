package PracticePackage;

public class FizzBuzzGame {
	public static void main(String[] args) {
		
		int start = 1;
		int end = 20;
		
		for(int i = start; i <= end; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		printFizzBuzz(7, 20);
	}
	
	public static void printFizzBuzz(int start, int end) {
		for(int i = start; i <= end; i++) {
			//if divisible by 3 = fixx
			// if divisible by 5 = buzz
			// if divisible by both = fizzbuzz
			//print number
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			
		}
	}

}
