package day.three;

public class ActivityForMultiplicationAndDivision {
	
	// create class
	// create main method
	// create variable bellow
	// iphonePrice = 1299.99
	// add 6% tax. price * 6 / 100;
	// print the result
	
	public static void main(String[] args) {
		double iphonePrice = 1299.99;
		double iphoneTax = iphonePrice * 6 / 100;
		double result = iphonePrice + iphoneTax;
		System.out.println(result);
		
		// or
		double priceIphone = 1299.99;
		int taxPercent = 6;
		
		double taxPrice = priceIphone + taxPercent / 100;
		double totalPrice = priceIphone + taxPrice;
		System.out.println(totalPrice);
	}

}
