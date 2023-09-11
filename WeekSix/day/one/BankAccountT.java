package day.one;

public class BankAccountT {
	// create these variables for this class
	// String firstName
	String firstName;
	// String lastName
	String lastName;
	// String dateOfBirth
	String dateOfBirth;
	// String address
	String address;
	// double balance
	double balance;

	// create a default constructor
	public BankAccountT() {
		this.firstName = "";
		this.lastName = "";
		this.dateOfBirth = "";
		this.address = "";
		this.balance = 0;
	}

	// create a parameterized constructor
	public BankAccountT(String firstName, String lastName, String dateofBirth, String address, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateofBirth;
		this.address = address;
		this.balance = balance;
	}

	// withdraw
	// create a method that withdraws the money from the account and returns the
	// amount
	public double withdraw(double amount) {
		if (amount <= balance) {
			// we have enough money
			balance -= amount;
			System.out.println("a amount of $" + amount + " withdrawn successfully!");
			return amount;
		} else {
			System.out.println("Insufficient balance!");
			return 0;
		}

	}

	// deposit

	public void printInfo() {
		String res = "BankAccount [firstName: " + firstName + ", lastName: " + lastName + ", \ndateOfBirth: "
				+ dateOfBirth + ", address: " + address + ", \nbalance: " + balance + "]\n";

		System.out.println(res);
	}
}
