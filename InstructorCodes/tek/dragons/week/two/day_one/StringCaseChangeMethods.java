package tek.dragons.week.two.day_one;

public class StringCaseChangeMethods {
	// String class methods. 
	// methods are functions that is doing a specific task. 
	public static void main(String[] args) {
		String gender = "male"; //MALE
		// change all the letter to be upper case in String. 
		// toUpperCase() method is use to change the all letters of 
		// String to Upper Case. 
		String genderInUpperCase = gender.toUpperCase();
		System.out.println(genderInUpperCase);
		
		//change the letters for be lower case. 
		String city = "LONDON";
		//
		String cityInLowerCase = city.toLowerCase();
		System.out.println(cityInLowerCase);
		
		
		
		//Activity. 
		// create variable name = "moHammAD";
		// change the variable to be all lower case. 
		String name = "moHammAD";
		String inLowercase = name.toLowerCase();
		System.out.println(inLowercase);
	}
}
