package PracticePackage;

public class RemoveChar {
	public static void main(String[] args) {
		String str = "Good morning";
		
		String strUpdated = str.replace(" ", "");
		String strUpdated2 = str.replaceAll("morning", "Evening");
		System.out.println(strUpdated);
		System.out.print(strUpdated2);
	}

}
