package day.three;

public class SubtractionActivityPractice {
	
	// create class
	// create main method
	// declare bellow variable
	// laptopPrice = 1956.99
	// laptopTax = 40.21
	// discount = 150
	//subtract discount from laptopPrice
	// them add it with laptoptax
	// then print the result
	
	public static void main(String[] args)	{
		double laptopPrice = 1956.99;
		double laptopTax = 40.21;
		int discount = 150;
		
		double result = laptopPrice - discount + laptopTax;
	    System.out.println(result);
		
		// or
		
		double priceWithDiscount = laptopPrice - discount;
		System.out.println(priceWithDiscount);
		
		
		
		
	}

}
