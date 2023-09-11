package tek.dragons.week.two_review;

public class Activity2 {
	// Activity.
	// Variable password = "password@123";
	// check empty. blank. and char @ in this password.
	// check length in this password.
	public static void main(String[] args) {
		String password = "password@123";
		// this is empty string = ""
		boolean passIsEmpty = password.isEmpty();
		// this is blank String = " "
		boolean passIsBlank = password.isBlank();
		int indexOf = password.indexOf("@");
		int length = password.length();
		System.out.println("Empty Check: " + passIsEmpty);
		System.out.println("Blank Check: " + passIsBlank);
		System.out.println("Character Check: " + indexOf);
		System.out.println("Length Check: " + length);
	}
}
