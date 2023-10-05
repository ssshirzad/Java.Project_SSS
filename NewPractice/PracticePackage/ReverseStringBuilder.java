package PracticePackage;

public class ReverseStringBuilder {
	public static void main(String[] args) {
		
		String originalString = "good";

		StringBuilder builder = new StringBuilder(originalString);
		StringBuilder reversedString = builder.reverse();
		
		System.out.println("The original String is: "+ originalString);
		System.out.println("The reverse of String is: "+ reversedString);
	}

}
