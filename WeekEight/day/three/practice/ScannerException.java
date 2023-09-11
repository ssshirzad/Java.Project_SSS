package day.three.practice;

import java.util.Scanner;

public class ScannerException {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter Age");
			int age = scan.nextInt();
		System.out.println("You're "+age+" years old");
	}catch(RuntimeException exception) {
		System.out.println("Please enter a number");
	}
scan.close();
}
}