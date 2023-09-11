package day.two;
 import java.util.Scanner;
 
public class DoWhile {
	//Fill in the blank spaces to complete a java program that gets 
	//the input from user and prints the result
	//until the result is greater than 100.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		do { 
			System.out.println("Enter a Number");
			int number = scan.nextInt();
			result += number;
		}while (result < 100);
		System.out.println(result);
		scan.close();
	


}
}