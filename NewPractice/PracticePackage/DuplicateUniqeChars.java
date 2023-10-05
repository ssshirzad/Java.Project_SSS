package PracticePackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUniqeChars {

	public static void main(String[] args) {
		char[] chars = {'a', 'b', 'c', 'd','d','e', 'e'};
		
		Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> duplicateChars = new HashSet<Character>();
		
		for(char c : chars) {
			if(Character.isLetter(c)) {
				if(!uniqueChars.add(c)) {
					duplicateChars.add(c);
				}
			}
		}
		System.out.println("Unique Chars: "+ uniqueChars);
		System.out.println("Duplicate Chars: "+duplicateChars);

	}

}
