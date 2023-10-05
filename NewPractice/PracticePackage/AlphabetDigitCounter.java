package PracticePackage;

public class AlphabetDigitCounter {
	public static void main(String[] args) {
		String str = "lsjfslfsjl7hglhsldhfshdfslhfs123lhfh";
		
		int charCounter = 0;
		int digitCounter = 0;
		int strLength = str.length();
		
		for(int i = 0; i < strLength; i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				charCounter++;
			}
			if(Character.isDigit(str.charAt(i))) {
				digitCounter++;
		}
	
	}
		System.out.println("Chars = "+charCounter);
		System.out.println("Digits = "+digitCounter);
		System.out.println("Length = "+ strLength);

}
}
