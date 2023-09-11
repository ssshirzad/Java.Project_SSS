package tek.dragons.week.five.day_one;

public class StringSplitMethod {
	public static void main(String[] args) {
		String text = "Welcome to Java Class";
		//If we want to split this text to words ? 
		// output should be 
		//Welcome
		//to
		//Java
		//Class
		//split method. take a specific character. and return array of String. 
		String[] words = text.split(" ");
		System.out.println(words.length);
		for(String value : words) {
			System.out.println(value);
		}
		
		String sentence = "Welcome, This is, Java Class";
		String[] strArray = sentence.split(",");
		for (String value : strArray) {
			System.out.println(value);
		}
	}
}
