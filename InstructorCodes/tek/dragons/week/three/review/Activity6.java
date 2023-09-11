package tek.dragons.week.three.review;

import java.time.LocalDateTime;

public class Activity6 {
	// write a program tell us which season of year it is.
	// base on month value. 2 => Winter.
	// Winter – December, January and February.
	// Spring – March, April and May.
	// Summer – June, July and August.
	// Autumn – September, October and November.
	// use if-else statements.
	public static void main(String[] args) {
		//How to find todays date?
		//How to find todays month? LocalDate or LocalDateTime. from java.time Library
		LocalDateTime todaysDate = LocalDateTime.now();
		System.out.println(todaysDate);
		int monthOfYear = todaysDate.getMonthValue();

		if (monthOfYear == 12 || monthOfYear == 1 || monthOfYear == 2) {
			System.out.println("It's Winter.");
		} else if (monthOfYear == 3 || monthOfYear == 4 || monthOfYear == 5) {
			System.out.println("It's Spring");
		} else if (monthOfYear == 6 || monthOfYear == 7 || monthOfYear == 8) {
			System.out.println("It's Summer");
		} else if (monthOfYear == 9 || monthOfYear == 10 || monthOfYear == 11) {
			System.out.println("It's Autumn");
		} else {
			System.out.println("Wrong entry for month of year.");
		}
	}
}
