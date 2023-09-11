package day.four;

public class FruitDiscountMine {
	public static void main(String[] args) {

		double applePrice = 10.20;
		double appleQuantity = 90.21;
		double orangePrice = 9.99;
		double orangeQuantity = 102.32;

		double appleTotal = appleQuantity * applePrice;
		double orangeTotal = orangeQuantity * orangePrice;
		double fruitTotal = appleTotal + orangeTotal;
		System.out.println("Total Before Tax" + " " + fruitTotal);

		if (fruitTotal < 500) {
			fruitTotal -= (fruitTotal * 2) / 100;

		} else if (fruitTotal >= 500 && fruitTotal < 2000) {
			fruitTotal -= (fruitTotal * 5) / 100;
		} else if (fruitTotal >= 2000) {
			fruitTotal -= (fruitTotal * 10) / 100;
		}
		double taxTotal = fruitTotal * 4.32 / 100;
		System.out.println("Total Tax" + " " + taxTotal);

		double totalDiscount = fruitTotal * 5 / 100;
		System.out.println("Total Discount" + " " + totalDiscount);

		double subTotal = fruitTotal + taxTotal - totalDiscount;
		System.out.println("Total Due:" + " " + subTotal);

	}

}
