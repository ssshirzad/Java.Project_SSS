package day.one;

public class StringConcatination {
	public static void main(String[] args) {
		
		// String manipulation
		// Concatenation as appending to String
		
		String title = "Mr.";
		String firstName = "John";
		String lastName = "Smith";
		
		// Concatenate using + sign
		String fullName = title + " " +firstName + " " + lastName;
		
		// " " This is how we can put space between the strings
		
		System.out.println(fullName);
		
		String address = " 123 Main Street";
		String city = "Alexandria";
		String zipCode = "22125";
		
		String fullAddress = address +" " + city + " " + zipCode;
		fullAddress = fullAddress.trim();
		System.out.println(fullAddress);
		
		String carMake = "Toyota";
		String carModel = "Rav4";
		char whiteSpace = ' ';
		
		String carType = carMake + whiteSpace + carModel + whiteSpace;
		System.out.println(carType);
		

		
		
	}

}
