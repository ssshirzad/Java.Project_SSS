package review;

public class Activity7 {
	public static void main(String[] args) {
		// Activity fullName = "John, Smith";
		// Separate fist name and last name
		
		String fullName = "Schafie, Shirzad";
		
		int indexOfComma = fullName.indexOf(',');
		String firstName = fullName.substring(0, indexOfComma);
		String lastName = fullName.substring(indexOfComma+1);
		
		System.out.println(firstName.trim());
		System.out.println(lastName.trim());
		
		
		
		
		
		
		String fullNamee = "Schafiee, Shirzad";
		int commaIndex = fullNamee.indexOf(',');
		System.out.println(commaIndex);
		
		String firstPart = fullNamee.substring(0, 7);
		String secondPart = fullNamee.substring(9);
		System.out.println(firstPart.trim());
		System.out.println(secondPart.trim());
		
		
		
		
		
		
	}

}
