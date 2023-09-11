package day.four.practice;

public class Activity1 {
public static void main(String[] args) {
	
	// applePrice = 10.20;
		// quantityApple = 90.21;
		// orangePrice = 9.99;
		// quantityOrange = 102.32;
		// Calculate subtotal;
		// if subtotal less than 500 , give 2% discount.
		// if between 500 and 2000 , give 5% discount
		// greater then 2000, give 10% discount.
		// then add 4.32% tax
		// print amount of discount
		// print amount of tax
		// then print payable amount.
		// 15 minute
	
	double applePrice = 10.20;
	double appleQuantity = 90.21;
	double orangePrice = 9.21;
	double orangeQuantity = 102.32;
	
	double appleTotal = appleQuantity * applePrice;
	double orangeTotal = orangeQuantity * orangePrice;
	
	double total = 0;
	double discount = 0;
	double tax = 0;
	
	total += appleTotal;
	total += orangeTotal;
	
	if(total < 500) {
		discount = total * 2 / 100;
		tax = total * 4.32 / 100;
		total -= discount;
	}else if(total >= 500 && total <= 2000) {
		discount = total * 5 / 100;
		tax = total * 4.32 / 100;
		total -= discount;
	}else if(total > 2000) {
		discount = total * 10 / 100;
		tax = total * 4.32 / 100;
		total -= discount;
	}
	System.out.println("Discount: "+ discount);
	System.out.println("Tax: "+ tax);
	System.out.println("Total Due: "+ total);
	
	
}
}
