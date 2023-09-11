package day.three;

public class PasswordActivity {
	// Activity
	// declare variable password and assign any value you want.
	// check if password empty print in console password is empty.
	// check if password is blank print password is blank
	// check if password length is <= 8 print choose better password.
	// otherwise password is good.
	public static void main(String[] args) {
		String password = "12134A1231";
		if (password.isEmpty()) {
			System.out.println("Password is empty");
		} else if (password.isBlank()) {
			System.out.println("Password is Blank");
		} else if (password.length() <= 8) {
			System.out.println("Weak password, choose another one");
		} else {
			System.out.println("Password is good.");
		}
	}
}
