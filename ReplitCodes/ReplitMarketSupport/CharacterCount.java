package ReplitMarketSupport;

import java.util.HashMap;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "There is no one worthy of worship but Allah (swt)";
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			if(c != ' ' & c != '(' & c != ')') {
				charCount.put(c, charCount.getOrDefault(c, 0)+1);
			}
		}
		System.out.println("Char Count: "+ charCount);
	}

	
}
