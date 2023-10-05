package PracticePackage;

public class PalindromeStringMethod {

	public static void main(String[] args) {
		
		String str = "hanah";
		
		if(isPalindrome(str)) {
			System.out.println(str + " is Palindrome");
		}else {
			System.out.println(str + " is NOT Palindrome");
		}

	}
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() -1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
