package day.one;

public class WellsFargo {
	String firstName;
	String lastName;
	int age;
	double ballance;
	
	public WellsFargo() {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ballance = ballance;
	}
public void bankAccount(String firstName, String lastName, int age, double ballance) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.ballance = ballance;
}
public void printInfo() {
	String info = "Customer Name: " + firstName +' '+ lastName +' '+ age +' '+ ballance; 
	System.out.println(info);
	System.out.println();
	
}
	

public double withdraw(double amount) {
	if (amount <= ballance) {
		ballance -= amount;
		System.out.println("Withdraw Successfull!!!!");
		System.out.println("Amount withdrawn: $"+ amount);
		System.out.println("Remaining ballance: $" + ballance);
		return ballance;
	}else {
		System.out.println("Insufficient ballance");
		return 0;
	}
	}
	
public double deposit(double depositAmount) {
	if (depositAmount > 500) {
		System.out.println("Daily deposit amount exceeded");
	}else {
		System.out.println("Your deposit of $"+ depositAmount +" Was successfull");
	}
	ballance += depositAmount;
	return ballance;
}

}
		
	




