package ReplitMarketSupport;

public class CountingBlankSpaces2 {
	public static void main(String[] args) {
		String text = "Tek School of America";
		int count = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(Character.isWhitespace(text.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of blank spaces are:: "+count);
	}

}
