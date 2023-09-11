package tek.dragons.week.two.day_two;

public class StringSubstringExample {
	public static void main(String[] args) {
		String message = "Title: Good evening";
		//Substring "Good Morning"; 
		int indexOfColon = message.indexOf(':');
		//System.out.println("Index of Colon " + indexOfColon);
		
		String greeting = message.substring(indexOfColon + 1);
		//System.out.println(greeting);
		
		//Activity
		String email = "johnSmith@gmail.com";
		//take gmail.com out from this text. 
		// we need substring and beginning index. 
		// what is beginning index? 10
		int signIndex = email.indexOf('@');
		String emailSub = email.substring(signIndex + 1);
		System.out.println(emailSub);
		
		//from email take out left side of @ johnSmith
		String emailFirstPart =email.substring(0, signIndex);
		System.out.println(emailFirstPart);
	}
}
