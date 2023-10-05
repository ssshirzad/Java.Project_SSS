package PracticePackage;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Howw to count chars in a string";
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			if(charCount.containsKey(str.charAt(i))) {
				charCount.put(str.charAt(i), charCount.get(str.charAt(i)) +1);
			}else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);

	}
	
	public static Map<Character, Integer> countOfChars(String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
			}else {
				chars.put(str.charAt(i), 1);
			}
		}
		return chars;
		
	}

}
