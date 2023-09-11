package day.four.practice;
import java.util.Scanner;
public class Activity2 {
	// ask user the length of array of Integer
	// create an array for that length 
	// then Ask user to input numbers 
	// and then find the sum of the numbers. 
	// 20 Minute
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Array");
		
		int lengthOfArray = scan.nextInt();
		
		int[] numbers = new int[lengthOfArray];
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
			sum+= numbers[i];
		}
		System.out.println("sum of Array: "+ sum);
		scan.close();
	}

}
