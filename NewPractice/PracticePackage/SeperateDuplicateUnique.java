package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SeperateDuplicateUnique {

	public static void main(String[] args) {
		List<String> allStrings = new ArrayList<>();
		allStrings.add("apple");
		allStrings.add("banana");
		allStrings.add("apple");
		allStrings.add("cherry");
		allStrings.add("banana");

		Set<String> uniqueStrings = new HashSet<>();
		List<String> duplicateStrings = new ArrayList<>();

		for(String str : allStrings) {
			if(!uniqueStrings.add(str)) {
				duplicateStrings.add(str);
			}
		}
		System.out.println(uniqueStrings);
		System.out.println(duplicateStrings);
	}

}
