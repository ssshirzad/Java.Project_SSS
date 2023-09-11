package tek.dragons.week.ten.day_three;

import java.util.Scanner;

public class Activity3 {
	// Create a Password Check Code.
	// Take user input for password.
	// Check length to be more that 8 character.
	// should have at least one numbers.
	// should have at least one special Character.
	// Should have at least on Upper Case letter.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		System.out.println("Enter your password");
		String password = scanner.next();
		scanner.close();	
		if (password.length() >= 8) {
			//Next check digits
			String keepDigits = password.replaceAll("[^0-9]", "");
			if(keepDigits.length() >= 1) {
				//next check UpperCase Letters
				String upperCaseLetters = password.replaceAll("[^A-Z]", "");
				if (upperCaseLetters.length() >= 1) {
					//next check specialCharacters
					String specialCharacters = password.replaceAll("[A-Za-z0-9]", "");
					if (specialCharacters.length() >= 1) {
						System.out.println("Valid Password");
					}else {
						System.out.println("Password should contain at least 1 Special Character");
					}
				}else {
					System.out.println("Password should contain at least 1 Upper Case Letter");
				}
			}else {
				System.out.println("Password should contain at least 1 digits");
			}		
		}else {
			System.out.println("Password Length should be more that 8 Character");
		}

	}
}
