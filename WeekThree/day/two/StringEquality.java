package day.two;

public class StringEquality {
	//String is Non-primitive Data Type (It's Class). 
	// Equality Check of String value. 
	public static void main(String[] args) {
		String city = "tysons";
		
		String city2 = "Tysons";	
		//String equality check is with equals() method. 
		//equals method take a String as argument in parenthesis. 
		//equals method is case sensitive 
		boolean isCityEqual = city.equals(city2);
		System.out.println(isCityEqual);
		
		//to ignore String case sensitivity 
		// we use equalsIgnoreCase() method. 
		boolean equalIgnoreCase = city.equalsIgnoreCase(city2);
		System.out.println("Ignore Case result " + equalIgnoreCase);
	}

}
