package tek.dragons.week.three.day_three;

public class SwitchStatement {
	// Switch statement Another type of selection in java.
	public static void main(String[] args) {
		String gender = "lkjhlkjhk";
		// 3 type of selection, male, female, other.

		switch (gender) {
		// Define the cases for this variable.
		case "male":
			System.out.println("Gender is male");
			break; // stop and switch case is completed.
		case "female":
			System.out.println("Gender is female");
			break;
		case "other":
			System.out.println("Gender is other");
			break;
		default: 
			System.out.println("Wrong Entry");
			break;
		}
		
		System.out.println(" My code is done here after switch");

	}
}
