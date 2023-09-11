package tek.dragons.week.four.day_one;

import java.util.Scanner;

public class ScannerExample1 {
	
	public static void main(String[] args) {
		//Get input from user
		//Create a new object of Scanner Class. 
		Scanner scannerObject = new Scanner(System.in);
		
		//take user's name as input. 
		System.out.println("Please enter your name:");
		String name = scannerObject.next();
		
		System.out.println("Your name is " + name);
		
		//Close the created Scanner Object when you are done using it. 
		scannerObject.close();
	}
}
