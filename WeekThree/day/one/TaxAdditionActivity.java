package day.one;

public class TaxAdditionActivity {
	public static void main(String[] args) {
		
		double appleTotalPrice = 29.10;
		double orangeTotalPrice = 20.20;
		double kiwiTotalPrice = 12.32;
		int tax = 4;
		
		double total = 0;
		
		total += appleTotalPrice;
		total += orangeTotalPrice;
		total += kiwiTotalPrice;
		System.out.println("Total before tax " + total);
		
		double result = total + (total *4) / 100;
		System.out.println("Total after tax " + result);
		
		// total += (total *4) / 100;
		// System.out.println(total);
		
	}

}
