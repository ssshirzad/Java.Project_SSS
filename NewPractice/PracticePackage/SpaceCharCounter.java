package PracticePackage;

public class SpaceCharCounter {

	public static void main(String[] args) {
		String str = "There is no diety worthy of worship but Allah (swt)";
		int spaceCounter = 0;
		int charCounter = 0;

		for (Character c : str.toCharArray()) {
			if (c == ' ') {
				spaceCounter++;

			}

		}
		for(Character c : str.toCharArray()) {
			if(c == 'o') {
				charCounter++;
			}
		}
		System.out.println("Total spaces in String: "+spaceCounter + " ");
		System.out.println("Total 'o' in String: "+ charCounter + " ");
		

	}

}
