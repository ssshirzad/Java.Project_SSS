package day.three.practice;

public class IphonePrice {
	// create class
		// create main method
		// create variable bellow
		// iphonePrice = 1299.99
		// add 6% tax. price * 6 / 100;
		// print the result
	public static void main(String[] args) {
		
		double iPhonePrice = 1299.99;
		int tax = 6;
		
		double iPhoneTax = iPhonePrice * 6 /100;
		double iPhoneTotal = iPhonePrice + iPhoneTax;
		System.out.println(iPhoneTotal);
	}
}
