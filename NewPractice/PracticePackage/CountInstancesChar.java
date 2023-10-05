package PracticePackage;

import java.util.HashMap;
import java.util.Map;

public class CountInstancesChar {

	public static void main(String[] args) {

		String str = "find instances of each char in this string";
		
		//using for loop
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(charCount.containsKey(str.charAt(i))) {
				charCount.put(str.charAt(i), charCount.get(str.charAt(i)) +1);
			}else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println("for loop: "+charCount);
		
		
		String str2 = "finding instances using for each loop";
		
		//using for each loop
		Map<Character, Integer> charCount2 = new HashMap<Character, Integer>();
		for(char c : str2.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				charCount2.put(c, charCount2.getOrDefault(c, 0) +1);
			}
		}
		System.out.println("For each loop: "+charCount2);
		
		
		//looking for specific character
		Map<Character, Integer> specificCharCounter = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			if(c == 'i') {
				specificCharCounter.put(c, specificCharCounter.getOrDefault(c, 0) +1);
			}
		}
		System.out.println("Specific Character: "+specificCharCounter);

	}

}
