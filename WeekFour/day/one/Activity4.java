package day.one;

import java.util.Scanner;

public class Activity4 {
	// ask user to choose a password.
	// if the length of password is less than 8
	// print choose stronger password.
	// otherwise print password is strong.
	// ctrl + shift + F ,, command + shift + F
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a password");
		String password = scanner.next();
		scanner.close();
		if (password.length() < 8) {
			System.out.println("Choose strong password");
		} else {
			System.out.println("Password is good.");
			scanner.close();
		}
	}

}
