package tek.dragons.week.three.day_three;

public class Activity4 {
	// applePrice = 10.20;
	// quantityApple = 90.21;
	// orangePrice = 9.99;
	// quantityOrange = 102.32;
	// Calculate subtotal;
	// if subtotal less than 500 , give 2% discount.
	// if between 500 and 2000 , give 5% discount
	// greater then 2000, give 10% discount.
	// then add 4.32% tax
	// print amount of discount
	// print amount of tax
	// then print payable amount.
	// 15 minute
	public static void main(String[] args) {
		double applePrice = 10.20;
		double quantityApple = 90.21;
		double orangePrice = 9.99;
		double quantityOrange = 102.32;

		double subtotal = 0;
		subtotal += applePrice * quantityApple;
		subtotal += orangePrice * quantityOrange;
		// initial point for discount.
		double discount = 0;
		if (subtotal < 500) {
			discount = subtotal * 2 / 100;
			subtotal -= discount;
		} else if (subtotal >= 500 && subtotal < 2000) {
			discount = subtotal * 5 / 100;
			subtotal -= discount;
		} else if (subtotal >= 2000) {
			discount = subtotal * 10 / 100;
			subtotal -= discount;
		}

		// calculate tax of 4.32%
		double tax = subtotal * 4.32 / 100;
		double totalToPay = subtotal + tax;
		System.out.println("Discount amount is " + discount);
		System.out.println("Tax amount is " + tax);
		System.out.println("Payable amount is " + totalToPay);
	}
}
