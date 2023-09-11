package tek.dragons.week.one.day.four;

public class Activity {
	// 1) 
	// Create Class 
	// Create main method.
	// Create variable below
	// applePrice 1.19; 
	// orangePrice 0.99; 
	// given somebody bought 6 apple and 9 orange
	// calculate how much is total price. 
	
	// 2)
	// Add 4% Tax to total price. 
	
	public static void main(String[] args) {
		double applePrice = 1.19;
		double orangePrice = 0.99;
		int appleQuantity  = 6; 
		int orangeQuantity = 9;
		double taxPercent = 4; 
		
		double appleTotal = applePrice * appleQuantity; 
		double orangeTotal = orangePrice * orangeQuantity; 
		
		double subtotal = appleTotal + orangeTotal; 
		
		double tax = subtotal * taxPercent / 100; 
		
		double totalPrice = subtotal + tax; 
		System.out.println(totalPrice);
	}
}
