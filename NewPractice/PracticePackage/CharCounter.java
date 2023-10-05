package PracticePackage;

public class CharCounter {

	public static void main(String[] args) {
		String str = "How to count characters";
		int charCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				charCounter++;
			}
		}
		System.out.println(charCounter);
	}

}
