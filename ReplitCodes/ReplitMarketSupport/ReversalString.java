package ReplitMarketSupport;

public class ReversalString {
	public static void main(String[] args) {
		String message = "My name is Schafie";
		
		StringBuilder reveresed = new StringBuilder();
		
		for(int i = message.length()-1; i >=0; i--) {
			reveresed.append(message.charAt(i));
		}
		System.out.println(reveresed);
	}

}
