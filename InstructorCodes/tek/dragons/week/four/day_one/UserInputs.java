package tek.dragons.week.four.day_one;

import java.util.Scanner;

public class UserInputs {
	public static void main(String[] args) {
		//using Scanner to get User Input. 
		//First create a new object from Scanner class. 
		// Import Scanner Library to the Class using it. 
		// import java.util.Scanner;
		Scanner objectName = new Scanner(System.in);	
		//get input from user in console. 
		// lets ask user age. 
		// nextInt() method is to get an Integer as User input. 
		int age = objectName.nextInt();
		System.out.println("Your age is " + age);
		
		//Ask User's name input. 
		String firstName = objectName.next();
		System.out.println("Your name is " + firstName);
		
		//how to get double value. 
		double price = objectName.nextDouble();
		System.out.println("Price is " + price);
		objectName.close();
	}
}
