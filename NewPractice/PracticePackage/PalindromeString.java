package PracticePackage;

public class PalindromeString {

	public static void main(String[] args) {
		String original = "hanxah";
		String reverse = "";
		
		for(int i = original.length()-1; i>= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
			if(original.equals(reverse)) {
				System.out.println(original + " is Palindrome");
			}else {
				System.out.println(original + " is NOT Palindrome");
			}
		}

	}


