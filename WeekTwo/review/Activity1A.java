package review;

public class Activity1A {
	public static void main(String[] args) {
		// Activity
		// Variable quantity = 12.32
		// Variable unitPrice = 100.54
		// variable taxPercentage = 6.6
		// variable discount = 2
		// find total price
		// out put "total price is" totalPrice;
		
		double goldQuantity = 12.32;
		double goldPrice = 100.54;
		double taxPercent = 6.5;
		double discountDollar = 2;
		
		double goldTotal = goldQuantity * goldPrice;
		double goldTax = goldTotal * taxPercent / 100;
		double goldSubTotal = goldTotal + goldTax - discountDollar;
		System.out.println(goldSubTotal);
	}

}
