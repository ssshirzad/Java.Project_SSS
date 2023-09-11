package day.two;

public class EqualityCheckPractice {
	public static void main(String[] args) {
		// Activity
		// declare and assign variable gender = MALE;
		// check gender is equals to male.
		// ignore the case sensitivity
		// print the result.
		
		String gender = "MALE";
		
		boolean genderCheck = gender.equalsIgnoreCase("male");
		System.out.println(genderCheck);
		
	}

}
