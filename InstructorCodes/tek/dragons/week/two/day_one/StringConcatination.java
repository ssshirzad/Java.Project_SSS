package tek.dragons.week.two.day_one;

public class StringConcatination {
	//String manipulation? 
	// Concatenation as appending to String. 
	public static void main(String[] args) {
		String title = "Mr.";
		String firstName = "John";
		String lastName = "Smith"; 
		
		//Concatenate using + sign. 
		String fullName = title + " " + firstName + " " + lastName;
		
		//System.out.println(fullName);
		
		String address = "1234 Some Street ";
		String city = "Alexandria ";
		String zipCode = "22125 ";
		
		String fullAddress = address + city + zipCode; 
		//System.out.println(fullAddress);
		
		String carMake = "Toyota";
		String carModel = "Rav4";
		String licensePlate = "ABS-1235";
		char whiteSpace = ' ';
		
		String carType  = carMake + whiteSpace + carModel + whiteSpace 
				+ licensePlate;
		//System.out.println(carType);
		
		//String and Integer concatenation. 
		int buildingNumber = 110; 
		String addressLine = "Some Street";
		String homeAddress = buildingNumber + addressLine; 
		System.out.println(homeAddress);
		
		//String something = 2 + 2 + "something";
//		String something = "Something" + 2 + 2; 
//		System.out.println(something);
		
		// Activity what should you do 
		// to see output as Something4
		String something = "Something" + (2 + 2); 
		System.out.println(something);
		
		//Activity
		// variable totalPrice = 100; 
		// variable taxPricce = 4.52;
		// add totalPrice and TaxPrice. and store in result variable. 
		// Your output should be 
		// "Total amount to Pay is " . result (104.52) $
		int totalPrice = 100;
		double taxPrice = 4.52;
		double result = totalPrice + taxPrice; 
		
		String output = "Total Amount to pay is $" + result;
		System.out.println(output);
		System.out.println("Total Amount to pay is $" + result);
	}
}
