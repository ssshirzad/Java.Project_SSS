package ReplitMarketSupport;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateCharsInString {
	public static void main(String[] args) {
		String str = "Asalam Alikom";
		
	Set<Character> uniqueChars = new HashSet<>();
	Set<Character> duplicateChars = new HashSet<>();
	
	for(char c : str.toCharArray()) {
		if(Character.isLetter(c)) {
			c = Character.toLowerCase(c);
			if(!uniqueChars.add(c)) {
				duplicateChars.add(c);
			}
		}
	}
	System.out.println("Duplicate Chars in String: ");
	for(char c : duplicateChars) {
		System.out.println(c);
	}
	}

}
