package tek.dragons.week.five.day_three;

import java.util.Scanner;

public class UserInput {
	public String getTextInput(String message) {
		UserOutput output = new UserOutput();
		output.printText(message);
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		String text = scanner.next();
		return text;
		
	}
	
	public int getNumberInput(String message) {
		UserOutput output = new UserOutput();
		output.printText(message);
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}
}
