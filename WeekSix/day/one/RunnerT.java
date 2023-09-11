package day.one;

public class RunnerT {
	public static void main(String[] args) {

		
		
		StudentT obj1 = new StudentT();
		
		obj1.firstName = "Anna";
		
		
		StudentT obj2 = new StudentT("Jack", "Ma", 35);
		
	
		
		
		System.out.println(obj1.firstName);
		System.out.println(obj2.firstName);
		
		System.out.println(obj2.lastName);
		System.out.println(obj1.lastName);
		obj1.lastName = "Davidson and I am testing";
		System.out.println(obj1.lastName);
		
		
//		obj1.printStudentInfo1();
//		obj2.printStudentInfo2();
		
		
		System.out.println("*************************************");
		
		BankAccountT user1 = new BankAccountT();
		user1.firstName = "Joe";
		user1.lastName = "karti";
		user1.dateOfBirth = "10/10/1990";
		user1.address = "123 somewhere in VA";
		user1.balance = 985.95;
		
		System.out.println(user1.firstName);
		// the hash code of the object - reference to the object in the memory
		
		BankAccountT user2 = new BankAccountT("Anna", "Jackson", "05/04/1993", "123 falls church, va", 855.25);
		System.out.println(user2.firstName + " " + user2.lastName + " " + user2.balance);
		user1.printInfo();
		user2.printInfo();
		
		user2.withdraw(200);
		user2.printInfo();
		user2.withdraw(700);
	}
}
