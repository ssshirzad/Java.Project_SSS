package day.three.practice;

public class PasswordActivity {
	
	// Activity
	// declare variable password and assign any value you want.
	// check if password empty print in console password is empty.
	// check if password is blank print password is blank
	// check if password length is <= 8 print choose better password.
	// otherwise password is good.
	
	public static void main(String[] args) {
		
		String password = "Islam is the truth";
		
		boolean isEmpty = password.isEmpty();
		System.out.println("Emply Check: "+ isEmpty);
		
		boolean isBlank = password.isBlank();
		System.out.println("Blank Check: "+ isBlank);
		
		boolean contains = password.contains("truth");
		System.out.println("Contains: "+ contains);
		
		if(password.length() < 8) {
			System.out.println("Chose a stronger password");
		}else {
			System.out.println("Password is good");
		}
	}

}
