package day.two;

public class StringCharacterAt {
	public static void main(String[] args) {
		String message = "Good Evening";
		char messageCharAt = message.charAt(8);
		System.out.println(messageCharAt);
		
		int messageIndexOf8 = message.indexOf('n');
		System.out.println(messageIndexOf8);
		
		String messageSub = message.substring(0, 4);
		System.out.println(messageSub);
		
		String messageSub1 = message.substring(5);
		System.out.println(messageSub1);
		
		String messageLower = message.toLowerCase();
		System.out.println(messageLower);
		
		String messageUpper = message.toUpperCase();
		System.out.println(messageUpper);
		
		int messageLength = message.length();
		System.out.println(messageLength);
	}

}
