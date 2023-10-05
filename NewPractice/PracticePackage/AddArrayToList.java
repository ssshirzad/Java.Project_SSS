package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayToList {

	public static void main(String[] args) {
		String[] strArray = { "Add", "array", "to", "list" };

		String strList = Arrays.toString(strArray);

		List<String> strListArray = new ArrayList<String>();
		strListArray.add(strList);
		System.out.println("strListArray "+strListArray);
		
		//Or using loop
		List<String> arrayList = new ArrayList<String>();
		for (String str : strArray) {
			arrayList.add(str);

		}
		System.out.println("ArrayList: "+ arrayList);

	}

}
