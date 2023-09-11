package day.one.practice;

public class BankAccount {
	
	String firstName;
	String LastName;
	int yearOfBirth;
	double ballance;
	
	public BankAccount() {
		this.firstName = "";
		this.LastName = "";
		this.yearOfBirth =  0;
		this.ballance = 0;
	}
	
	public BankAccount(String firstName, String lastName, int yearOfBirth, double ballance) {
		this.firstName = firstName;
		this.LastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.ballance = ballance;	
	}
	
	public double withdraw(double withDraw) {
		if (withDraw <= ballance) {
			ballance -= withDraw;
			System.out.println("The amount "+ withDraw + " has been successfuly withdrawn \nNew Ballance "+ ballance);
			return ballance;
		}else {
			System.out.println("The "+ withDraw + " withdraw amount exceeds the available ballance of: "+ ballance);
		}
		return 0;
	}
	public double deposit(double deposit) {
		if (deposit > 0 && deposit <=500) {
			ballance += deposit;
			System.out.println("The amount of "+ deposit + " has been successfully deposited in your account \nYour new ballance is: "+ ballance);
			return ballance;
		}else if(deposit > 500) {
			System.out.println("Amount exceeds daily deposit of $500 \nBallane "+ ballance);
			return ballance;
		}else {
			System.out.println("Invalid deposit amount");
		}
		return ballance;
	}
	
	public void printBankerInfo() {
		System.out.println("[First Name: " +firstName + ", "+"Last Name: "+ LastName + ", "+"Year Of Birth: "+ yearOfBirth+ ", "+"Availabe Ballance: "+ ballance +"]");
	}
	public void dashes() {
		String info = "[First Name: " +firstName + ", "+"Last Name: "+ LastName + ", "+"Year Of Birth: "+ yearOfBirth+ ", "+"Availabe Ballance: "+ ballance +"]";
		String dash = "";
		
		for(int i = 0; i < info.length(); i++){
			dash += "-";
		}
		System.out.println(dash);
		System.out.println(info);
		System.out.println(dash);
		
	}
	
	public String generateDashes(int count) {
		String dash = " ";
		for (int i = 0; i < count; i++) {
			
			dash += "-";
		}
		return dash;
	}
			
			 
			
}



		
				



