package tek.dragons.week.two_review;

public class Activity1 {
	//Activity
	// variable quantity = 12.32; 
	// variable unitPrice = 100.54;
	// variable taxPercentage = 6.6; 
	// variable discount = 2;
	// find total price. 
	// out put "Total Price is " totalPrice;
	
	public static void main(String[] args) {
		double quantity = 10.20;
		double unitPrice = 50.36;
		double taxPercentage = 2.36; 
		double discount = 0;
		
		double lineTotal = quantity * unitPrice;
		double taxPayable = lineTotal * taxPercentage / 100;
		double totalPrice = lineTotal + taxPayable - discount; 
		
		System.out.println("Total Price is $" + totalPrice);

	}
}
