package tek.dragons.week.two_review;

public class Activity5 {
	// activity fullName = "John, Smith";
	// separate first name and last name.
	public static void main(String[] args) {
		String fullName = "Mohammad, Shokriyan";
		
		int comaIndex = fullName.indexOf(',');
		String firstName = fullName.substring(0, comaIndex);
		String lastName = fullName.substring(comaIndex + 1);
		
		System.out.println(firstName.trim());
		System.out.println(lastName.trim());
	}
}
