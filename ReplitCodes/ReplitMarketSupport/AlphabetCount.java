package ReplitMarketSupport;

public class AlphabetCount {
	public static void main(String[] args) {
		String str = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		int countLetter = 0;
		int countDigit = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				countLetter++;
			}
		}
		System.out.println("The number of characters are: "+ countLetter);
		System.out.println("The count of digits are: "+countDigit);
	}
}

