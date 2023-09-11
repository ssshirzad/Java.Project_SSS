package ReplitMarketSupport;

public class CountingBlankSpaces {
	public static void main(String[] arges) {
		String text = "Tek School of America";
		char blankSpace = ' ';
		int countSpaces = 0;
		char[] textArray = text.toCharArray();
		
		for(int i =0; i < textArray.length; i++) {
			if(textArray[i] == blankSpace) {
				countSpaces++;
				
			}
		}
		System.out.println( "The number of blank spaces are: " + countSpaces);
		
	}

}
