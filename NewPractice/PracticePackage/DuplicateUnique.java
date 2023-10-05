package PracticePackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUnique {

	public static void main(String[] args) {
		String str = "this is a test";
		
		Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> duplicateChars = new HashSet<Character>();
		
		for(Character c : str.toCharArray()) {
			if(!uniqueChars.add(c)) {
				duplicateChars.add(c);
			}
		}
		System.out.println(uniqueChars);
		System.out.println(duplicateChars);

	}

}
