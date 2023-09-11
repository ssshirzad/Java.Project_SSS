package review;

public class Activity2 {
	
	// Activity
	// Variable Password = "password@123";
	// Check emply. blank. character @ in this password
	// check length in this password
	
	public static void main(String[] args) {
		String password = "password@123";
		
	boolean empty = password.isEmpty();
	boolean blank = password.isBlank();
	int indexOfAt = password.indexOf('@');
	int length = password.length();
	
	System.out.println("Empty Check:" + empty);
	System.out.println("Blank Check:" + blank);
	System.out.println("Index Check:" + indexOfAt);
	System.out.println("Length Check:" + length);
	
	
	// Activity
	// Variable Password = "password@123";
	// Check emply. blank. character @ in this password
	// check length in this password
	
	String passwordd = "password@123";
	
	boolean passwordEmpty = passwordd.isEmpty();
	boolean passwordBlank = passwordd.isBlank();
	
	int paswordAtSign = passwordd.indexOf('@');
	int passwordLength = passwordd.length();
	
	System.out.println(passwordEmpty);
	System.out.println(passwordBlank);
	System.out.println(paswordAtSign);
	System.out.println(passwordLength);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
