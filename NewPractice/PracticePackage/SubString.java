package PracticePackage;

public class SubString {
	public static void main(String[] args) {
		String fullName = "Schafie Shirzad";
		
		String firstName = fullName.substring(0, 7);
		String lastName = fullName.substring(8);
		
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
