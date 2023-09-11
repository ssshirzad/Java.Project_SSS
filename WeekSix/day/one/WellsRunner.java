package day.one;

public class WellsRunner {
	public static void main(String[] args) {
		
		WellsFargo customer = new WellsFargo();
		customer.firstName = "Schafie";
		customer.lastName = "Shirzad";
		customer.age = 34;
		customer.ballance = 750.45;
		
	
	customer.printInfo();
	customer.deposit(500.00);
	customer.printInfo();
	customer.deposit(5000.00);
	
	
	
	
//	WellsFargo customer2 = new WellsFargo();
//	
//	customer2.bankAccount("Nooryah", "Shirzad", 30, 985.55);
//	customer2.printInfo();
//	customer2.withdraw(150.00);
//	customer2.printInfo();

	
	
	
	}
	
	
	

}
