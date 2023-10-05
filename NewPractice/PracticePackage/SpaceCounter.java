package PracticePackage;

public class SpaceCounter {
	public static void main(String[] args) {
		String str = "There is no diety worthy of worship but Allah (swt)";
		int spaceCounter = 0;
		char[] strArray = str.toCharArray();
		
		int strArrayLength = str.length();
		
		for(int i = 0; i < strArrayLength; i++) {
			if(strArray[i] == ' ') {
				spaceCounter++;
			}
		}
		System.out.println("The number of spaces in the given string is: "+ spaceCounter);
	}

}
