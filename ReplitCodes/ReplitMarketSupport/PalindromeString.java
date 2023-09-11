package ReplitMarketSupport;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String text = scanner.nextLine();
		
		if(isPalindromeString(text)) {
			System.out.println("Input is Palindrome");
		}else {
			System.out.println("Input is not Palindrome");
		}
		scanner.close();
	}
private static boolean isPalindromeString(String text) {
	int left = 0;
	int right = text.length() -1;
	
	while(left < right) {
		if(text.charAt(left) != text.charAt(right)) {
			return false;
		}
		left ++;
		right --;
	}
	return true;
}
}
