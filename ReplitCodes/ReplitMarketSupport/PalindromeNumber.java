package ReplitMarketSupport;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int start = scanner.nextInt();
		System.out.println("Please enter an ending number");
		int end = scanner.nextInt();
		
		for (int number = start; number < end; number++) {
			if(isPalindrome(number)) {
				System.out.println(number);
			}
		}
		
		
		scanner.close();
	}
	
	private static boolean isPalindrome(int number) {
		String numStr = String.valueOf(number);
		int left = 0;
		int right = numStr.length() - 1;
		
		while(left < right) {
			if(numStr.charAt(left) != numStr.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}

}
