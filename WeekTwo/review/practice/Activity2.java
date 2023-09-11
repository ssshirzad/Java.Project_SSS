package review.practice;

public class Activity2 {
	// Activity
	// Variable Password = "password@123";
	// Check emply. blank. character @ in this password
	// check length in this password
	public static void main(String[] args) {
		
		String password = "password@123";
		
		boolean isEmpty = password.isEmpty();
		System.out.println(isEmpty);
		
		boolean isBlank = password.isBlank();
		System.out.println(isBlank);
		
		int charAt = password.indexOf('@');
		System.out.println(charAt);
		
		int length = password.length();
		
		System.out.println(length);
	}

}
