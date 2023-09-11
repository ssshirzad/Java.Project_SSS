package tek.dragons.week.one.day.three;

public class SubtractionActivity {
	// Create class. 
	// Create main method. 
	// declare below variable. 
	// laptopPrice = 1956.99;
	// laptopTax = 40.21; 
	// discount = 150; 
	// subtract discount from LaptopPrice 
	// then add it with laptopTax 
	// then print the result. 
	public static void main(String[] args) {
		double laptopPrice = 1956.99;
		double discount = 150; 
		double laptopTax = 40.21;
		
		double priceWithDiscount = laptopPrice - discount;
		System.out.println(priceWithDiscount);
		
		double totalPrice = priceWithDiscount + laptopTax;
		
		System.out.println(totalPrice);
		
	}
}
