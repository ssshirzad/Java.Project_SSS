package day.two;

public class Activity4 {
	// Activity
		// declare and assign variable gender = MALE;
		// check gender is equals to male.
		// ignore the case sensitivity
		// print the result.
		public static void main(String[] args) {
			String gender = "MALE";

			boolean check = gender.equalsIgnoreCase("female");
			System.out.println(check);

			// Check equality but not using the eqaulsIgnoreCase.
			String genderLowerCase = gender.toLowerCase();
			boolean checkIgnoreCase = genderLowerCase.equals("male");
			System.out.println(checkIgnoreCase);
		}
}
