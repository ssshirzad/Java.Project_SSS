package day.two;

import java.util.Scanner;

public class UserInput {
	//For Input we need scanner. 
	//this class have a dependency on Scanner. 
	//instance variable for Scanner. 
	private Scanner scanner; 
	
	// does every time we using Scanner do we need to pass new values / different values? NO
	//Scanner scanner = new Scanner(System.in)
	//Where is best place for Instantiate A new Object of Scanner. ? 
	public UserInput() {
		this.scanner = new Scanner(System.in);
	}
	//Get text input
	public String getTextInput(String message) {
		System.out.println(message);
		String input = scanner.next();
		return input;
	}
	// get number input. 
	public int getIntInput(String message) {
		System.out.println(message);
		int input = scanner.nextInt();
		return input;
	}
	
	public double getDoubleInput(String message) {
		System.out.println(message);
		double input = scanner.nextDouble();
		return input;
	}
	
	public void closeScanner() {
		//Null check is a pre-cautionary check 
		// to avoid performing task on a null object.
		if (scanner != null) {
			scanner.close();
		}
	}
}
