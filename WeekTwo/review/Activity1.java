package review;

public class Activity1 {
	
	public static void main(String[] args) {
		// Activity
		// Variable quantity = 12.32
		// Variable unitPrice = 100.54
		// variable taxPercentage = 6.5
		// variable discount = 2
		// find total price
		// out put "total price is" totalPrice;
		
		double safronQuantity = 12.32;
		double safronPrice = 100.54;
		double taxPercentage = 6.6;
		double discount = 2; // could change to double
		
		double safronTotal = 12.32*100.54;
		double safrontax = safronTotal * 6.6 / 100;
		double subTotal = safronTotal+safrontax;
		double discountPrice = subTotal * 2 / 100;
		double finalPrice = subTotal - discountPrice;
		System.out.println("Total Price is" +" "+finalPrice);
		
		
		
		// Activity
		// Variable quantity = 12.32;
		// Variable unitPrice = 100.54;
		// variable taxPercentage = 6.6;
		// variable discount = 2;
		// find total price
		// out put "total price is" totalPrice;
		
		double ipadQuantity = 12.32;
		double ipadPrice = 100.54;
		double ipadTax = 6.6;
		double ipadDiscount = 2;
		
		double ipadTotal = ipadQuantity * ipadPrice;
		double ipadTaxed = ipadTotal * ipadTax / 100;
		double ipadDiscounted = ipadTaxed * ipadDiscount / 100;
		double ipadSubTotal = ipadTotal + ipadTax - ipadDiscounted;
		System.out.println(ipadSubTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
