package PracticePackage;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrayString {
	
	public static void main(String[] args) {
		
		String[] strArray = {"how", "how", "to", "find", "duplicates", "in", "in", "array"};
		
		Set<String> strSet = new HashSet<String>();
		
		for(int i = 0; i < strArray.length; i++) {
			if(!strSet.add(strArray[i])) {
				System.out.println("Duplicate at iteration '"+i+"' with value '"+strArray[i]+"'");
			}
		}
	}

}
