package PracticePackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateUniquStrings {
	
	public static void main(String[] args) {
		
		String[] strArray = {"One", "One", "Two", "three", "four", "four"};
		
		List<String> strList1 = new ArrayList<String>();
		
		for(String str1: strArray) {
			strList1.add(str1);
			
		}
		
		List<String> strList = new ArrayList<String>();
		strList.add(0, "One");
		strList.add(1, "Two");
		strList.add(2, "Three");
		strList.add(3, "four");
		strList.add(4, "One");
		
		Set<String> uniqueString = new HashSet<String>();
		List<String> duplicateString = new ArrayList<String>();
		
		for(String str : strList1) {
			if(!uniqueString.add(str)) {
				duplicateString.add(str);
			}
		}
		 System.out.println("Duplicate Strings => "+duplicateString);
		 System.out.println("Unique Strings => "+ uniqueString);
		
		
	}

}
