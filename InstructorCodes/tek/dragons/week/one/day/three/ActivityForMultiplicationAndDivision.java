package tek.dragons.week.one.day.three;

public class ActivityForMultiplicationAndDivision {
	// Create class. 
	// Create main method. 
	// create variable below. 
	// iphonePrice = 1299.99; 
	// Add 6% tax. price * 6 / 100;
	// Print the result. 
	public static void main(String[] args) {
		
		double iphonePrice = 1299.99;
		int taxPercent = 6; 
		
		//Let's find tax price first. 
		double taxPrice = iphonePrice * taxPercent / 100; 
		
		double totalPrice = iphonePrice + taxPrice; 
		System.out.println(totalPrice);
	}
}
