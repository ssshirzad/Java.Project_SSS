package tek.dragons.week.five.day_one;

public class StringsAndLoops {
	public static void main(String[] args) {
		String text = "Welcome";
		// count how many letter 'e' in this text. 
		// we need to loop through each character? 
		// How to do it then? 
		//String is sequence for characters. it's and array of characters. 
		//how to convert the string to and array of character. 
		char[] characters = text.toCharArray();
		
		int count = 0; 
		for (char letter : characters) {
			//System.out.println(letter);
			if (letter == 'e' || letter == 'E') {
				count ++;
			}
		}
		System.out.println("Count of Letter e " + count);
	}
}
