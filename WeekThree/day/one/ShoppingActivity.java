package day.one;

public class ShoppingActivity {
	public static void main(String[] args) {
		
		double orangePrice = 19.99;
		double applePrice = 11.99;
		int mangoPrice = 5;
		double fruitTax = 2.5;
		
		double total = 0;
		
		total +=orangePrice;
		total += applePrice;
		total += mangoPrice;
		
		double tax = total * 2.5 / 100;
		double subTotal = total + tax;
		int castedTotal = (int) subTotal;
		System.out.println(castedTotal);
	}

}
