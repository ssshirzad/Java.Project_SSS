package tek.dragons.week.two.day_two;

public class StringRecaps {
	public static void main(String[] args) {

		String firstName = "John";
		String lastName = "Smith";

		// Concatenate two Strings.
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		//Make String all Lower Case / Upper Case
		String fullNameLowercase = fullName.toLowerCase();
		String fullNameUppercase = fullName.toUpperCase();
		System.out.println(fullNameLowercase);
		System.out.println(fullNameUppercase);
		//to find number of characters in String.
		int length = fullName.length();
		System.out.println("Length is " + length);

	}
}
