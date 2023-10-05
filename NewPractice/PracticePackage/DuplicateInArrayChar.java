package PracticePackage;


import java.util.HashSet;

import java.util.Set;

public class DuplicateInArrayChar {
	public static void main(String[] args) {

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'e', 'b', 'b' };
		
		Set<Character> charSet = new HashSet<Character>();
		
		for(int i = 0; i < chars.length; i++) {
			if(!charSet.add(chars[i])) {
				System.out.println("Duplicate Valiue at iteration "+i+ " with "+chars[i] + " value");
			}
		}

		}
	}

