package PracticePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountSpecificChar {
	public static void main(String[] args) {
		String str = "How to count specific chars in a string";
		
		str = str.toLowerCase();
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(Character c : str.toCharArray()) {
			if(c.equals('c') || c.equals('i')) {
				charCount.put(c, charCount.getOrDefault(c, 0)+1);
			}
		}
		
		for(Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println("Character "+ entry.getKey() +" apears "+ entry.getValue()+ " times in the bellow string: \n"+str);
		}
		System.out.println(charCount);
		


	}
}
