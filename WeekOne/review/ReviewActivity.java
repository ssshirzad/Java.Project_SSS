package review;

public class ReviewActivity {
	
	public static void main(String[] args) {
		
		// Create Class 
		// Create main method	
		// 
		//double applePrice = 1.19;
		//double orangePrice = 0.99; 
		//int taxPercentage = 4;
		//double result1 = applePrice * 6;
		//double result2 = orangePrice * 9;
		//double result3 = result1 + result2;
		//double totalPrice = result3 * taxPercentage / 100;
		//System.out.println(totalPrice);
		
		// instructor
		double applePrice = 1.19;
		double orangePrice = 0.99;
		int appleQuantity = 6;
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
