package PracticePackage;

import java.util.Arrays;

public class SplitStringArrays {
	
	public static void main(String[] args) {
		String str = "This is a test";
		
		String[] strArray = str.split(" ");
		String str2 = Arrays.toString(strArray);
		System.out.println(str2);
	}

}
