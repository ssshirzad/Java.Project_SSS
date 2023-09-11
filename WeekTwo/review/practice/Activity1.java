package review.practice;

public class Activity1 {
	public static void main(String[] args) {
		// Activity
				// Variable quantity = 12.32
				// Variable unitPrice = 100.54
				// variable taxPercentage = 6.5
				// variable discount = 2
				// find total price
				// out put "total price is" totalPrice;
		
		double quantity = 12.32;
		double unitPrice = 100.54;
		double taxPercent = 6.5;
		int discount = 2;
		
		double total = quantity * unitPrice;
		double taxedTotal = total * 6.5 / 100;
		double subTotal = total + taxedTotal - 2;
		System.out.println("Total Price is: "+ subTotal);
	}

}
