package day.two.practice;

public class Activity5 {
	// declare and assign variable applePrice = 10.91;
			// declare and assign appleQuantity = 50;
			// get totalPrice.
			// add 4% tax to total.
			// and check if the total after tax is less than 50.
	
	public static void main(String[] args) {
		
		double applePrice = 10.91;
		int appleQuantity = 50;
		int taxPercent = 4;
		
		double total = appleQuantity * applePrice;
		double tax = total * taxPercent/ 100;
		
		double subtotal = total + tax;
		
		boolean isLessThan = subtotal < 50;
		System.out.println("Total: " + subtotal);
		System.out.println("Is Total Less Than: " + isLessThan);
		
		
	}

}
