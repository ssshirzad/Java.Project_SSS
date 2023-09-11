package tek.dragons.week.three.day_one;

public class Acitivity4 {
	// declare variable
	// appleTotalPrice = 29.10;
	// orangeTotalPrice = 20.20;
	// kiwiTotalPrice = 12.32;

	// find total price.
	// then add 4% tax.
	public static void main(String[] args) {
		double appleTotalPrice = 29.10;
		double orangeTotalPrice = 20.20;
		double kiwiTotalPrice = 12.32;
		
		// declare and assign new variable for initial point. 
		double total = 0; 
		total += appleTotalPrice;
		total += orangeTotalPrice; 
		total += kiwiTotalPrice;
		System.out.println("Total before tax is " + total);
		total += (total * 4) / 100;
		System.out.println("final result is " + total);
	}
}
