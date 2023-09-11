package day.one.practice;

public class BankAccountRunner {
	
	public static void main(String[] args) {
		
		BankAccount bankerOne = new BankAccount();
		
		bankerOne.firstName = "Schafie";
		bankerOne.LastName = "Shirzad";
		bankerOne.yearOfBirth = 1988;
		bankerOne.ballance = 989.00;
		
		bankerOne.deposit(200.99);
		
		bankerOne.generateDashes(49);
		
		bankerOne.deposit(20.11);
		
		bankerOne.dashes();
		
		bankerOne.deposit(-1);
		
		bankerOne.dashes();
		bankerOne.withdraw(500);
		bankerOne.dashes();
		bankerOne.withdraw(800);
		System.out.println();
		bankerOne.printBankerInfo();
		
		bankerOne.dashes();
		BankAccount bankerTwo = new BankAccount("Zayed", "Shirzad", 2015, 4434.33);
		
		bankerTwo.dashes();
		bankerTwo.printBankerInfo();
		bankerTwo.dashes();
		bankerTwo.deposit(500);
	}

}
