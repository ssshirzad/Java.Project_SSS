package day.one.practice;
import java.util.Scanner;
public class Activity1 {
	// Activity
	// Ask user to input an integer number 
	// Ask user to input another integer number. 
	// add both number together and print the result. 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int firstInteger = scan.nextInt();
		int secondInteger = scan.nextInt();
		
		int result = firstInteger + secondInteger;
		System.out.println(result);
		scan.close();
		
		
		
	}

}
