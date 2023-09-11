package review.practice;

public class Activity7 {
	// Activity fullName = "John, Smith";
			// Separate fist name and last name
	public static void main(String[] arg) {
		
		String fullName = "John, Smith";
		
		int indexofcomma = fullName.indexOf(',');
		
		String firstName = fullName.substring(0, indexofcomma);
		String lastName = fullName.substring(indexofcomma+2);
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
