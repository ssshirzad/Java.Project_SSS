package day.two;

public class StringSubstringExample {
	
	public static void main(String[] args) {
		String message = "Title: Good Morning";
		// substring "Good Morning"
		int indexOfSemiColon = message.indexOf(':');
		
		String greeting = message.substring(indexOfSemiColon + 1);
		String trimmed = greeting.trim();
		System.out.println(trimmed);
		
		// take gmail.com out from text
		// we need substring and beginning index
		// what is beginning index? 10 
		
		String text = "JohnSmith@gmail.com";
		int textEmail = text.indexOf('@');
		System.out.println(textEmail);
		
		// we find the index of @ and do bellow
		
		String JohnEmail = text.substring(textEmail + 1);
		System.out.println(JohnEmail);
		
		String john = "johnsmith@gmail.com";
		String johnMail = john.substring(10);
		System.out.println(johnMail);
		
		String aaronEmail = "johnsmith@gmail.com";
		String aaronEmailSub = aaronEmail.substring(0, 9);
		System.out.println(aaronEmailSub);
		
		
		
		
		
		
		
		
		
		
	}

}
