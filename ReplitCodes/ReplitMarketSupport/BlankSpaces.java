package ReplitMarketSupport;

public class BlankSpaces {
	public static void main(String[] args) {
		String text = "Good morning, I hope all are doing well";
		
		char[] textChar = text.toCharArray();
		int spaceCount = 0;
		for(int i = 0; i < textChar.length; i++) {
			if(textChar[i] == ' ') {
				spaceCount++;	
			}
		}
		System.out.println("Total Space = " + spaceCount);
	}

}
