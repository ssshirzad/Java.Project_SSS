package tek.dragons.week.two.day_one;

public class StringLength {
	public static void main(String[] args) {
		String town = "Falls Church";
		String message = "I love java programming it's really cool";
		
		//how to find String length.
		//Using length method from String class. 
		// Length method return int as result of 
		//counting number of characters.
		int townLength = town.length();
		System.out.println(townLength);
		
		int messageLength = message.length();
		System.out.println(messageLength);
		
		
		//Activity 
		// create variable password = "someweirdPassword***&"
		// print how many character is in this password.
		String password = "someweirdPassword***&";
		int length = password.length();
		System.out.println("Password length is " + length);
	}
}
