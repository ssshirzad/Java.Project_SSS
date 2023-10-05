package PracticePackage;

public class PalindromeInteger {
	public static void main(String[] args) {
		
		int number = 222;
		if(isPalindromeInteger(number)) {
			System.out.println(number + " is palindrome");
		}else {
			System.out.println(number + " is NOT palindrome");
		}
		
	}
	
	public static boolean isPalindromeInteger(int number) {
		
		if(number < 0) {
			return false;
		}
		
		int originalInteger = number;
		int reversedInteger = 0;
		
		while(number != 0) {
			int digit = number % 10;
			reversedInteger = reversedInteger * 10 + digit;
			number /=10;
		}
		return originalInteger == reversedInteger;
	}

}
