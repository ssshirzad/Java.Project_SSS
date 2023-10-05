package day.four.practice;
import java.util.Scanner;
public class Activity1A {
	// create a program that take 3 integer number
		// and determine which one is greater.
		// 10 Minute
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		
		int sum = 0;
		sum+= first;
		sum+= second;
		sum+= third;
		if(first > second && first > third) {
			System.out.println(first + " is greater");
			
		}else if( second > first && second > third) {
			System.out.println(second + " is greater");
			
		}else if(third > first && third > second) {
			System.out.println(third + " is greater");
			
		}else {
			System.out.println("All inputs are equal");
			scan.close();
		}
		System.out.println("Sum of numbers: "+ sum);
		
	}

}
