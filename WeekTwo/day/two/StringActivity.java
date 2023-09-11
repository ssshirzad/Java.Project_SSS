package day.two;

public class StringActivity {
	public static void main(String[] args) {
		String message = "Title: Good Morning";
		int indexOfMessage = message.indexOf(':');
		System.out.println(indexOfMessage);
		
		String messageSubMain = message.substring(indexOfMessage+1);
		String messageTrimed = messageSubMain.trim();
		System.out.println(messageTrimed);
		
		
	}

}
