package tek.dragons.week.three.day_three;

public class IfStatementExample {
	public static void main(String[] args) {
		String gender = "None";
		// if gender is male do something.
		// if gender is female do something else.
		// else print something.
		// Ignore case sensitivity
		if (gender.equalsIgnoreCase("male")) {
			System.out.println("Gender is male");
		} else if (gender.equalsIgnoreCase("female")) {
			System.out.println("Gender is Female");
		} else {
			System.out.println("Gedner is unknown");
		}
	}
}
