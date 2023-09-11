package day.two.practice;

public class Activity4 {
	// Activity
			// declare and assign variable gender = MALE;
			// check gender is equals to male.
			// ignore the case sensitivity
			// print the result.
	
	public static void main(String[] args) {
		String gender = "MALE";
		
		boolean genderCheck = gender.equalsIgnoreCase("male");
		System.out.println(genderCheck);
		
		String genderToUpperCase = gender.toUpperCase();
		
		boolean genderCheck2 = genderToUpperCase.equals(gender);
		System.out.println(genderCheck2);
	}
}
