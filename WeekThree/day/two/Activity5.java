package day.two;

public class Activity5 {
	// declare and assign variable applePrice = 10.91;
		// declare and assign appleQuantity = 50;
		// get totalPrice.
		// add 4% tax to total.
		// and check if the total after tax is less than 50.
		public static void main(String[] args) {
			double applePrice = 10.91;
			double appleQuantity = 50;
			double tax = 4;

			double totalPrice = applePrice * appleQuantity;
			totalPrice += (totalPrice * tax) / 100; 
			System.out.println("Total Price after Tax " + totalPrice);
			boolean check = totalPrice < 50; 
			System.out.println(check);
		}
}
