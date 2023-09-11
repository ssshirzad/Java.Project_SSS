package tek.dragons.week.two.day_two;

public class StringCharacterAt {
	//CharAt(); 
	//Returning the Character on Specific index. 
	public static void main(String[] args) {
		String text = "This is a Text.";
		
		//what is the character in index 5; 
		//charAt method required to Pass Index number
		// to return a character. (just 1 Character). 
		char atIndex5 = text.charAt(5);
		System.out.println(atIndex5);
		
		//if no character in index passed to charAt method. 
		// then Error Happens (Exception). 
		// and your code crash.
		//char atIndex20 = text.charAt(20);
		
		//Activity. 
		// Variable city = "Falls Charch";
		// find character on index 6.
		String city = "Falls Charch";
		char atIndex6 = city.charAt(6);
		System.out.println("Index 6 of City is " + atIndex6);

		
		//Activity 
		// String date = "01-18-2023;
		// At index 2 and 5 should be -
		// MM-dd-yyyy
		String date = "12/18/2023";
		char index2 = date.charAt(2);
		char index5 = date.charAt(5);
		System.out.println(index2);
		System.out.println(index5);
	}
}
