package day.two.practice;
import java.util.Scanner;
public class DoWhileTwo {
	//Fill in the blank spaces to complete a java program that gets 
		//the input from user and prints the result
		//until the result is greater than 100.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int number = 0;
		do {
			System.out.println("Enter a number");
			number = scan.nextInt();
			total+= number;
		}while (total < 100);
		
		System.out.println("Your total: "+ total);
		scan.close();
	}

}
