package PracticePackage;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "Good";
		String str2 = "Goodz";
		
		boolean checkStr = str1.equals(str2);
		System.out.println(checkStr);
		
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		if(str1.compareTo(str2) < 0) {
			System.out.println("str2 is greater ");
		}else if(str2.compareTo(str1)< 0) {
			System.out.println("str1 is greater ");
		}else {
			System.out.println("Strings are eqaul in length");
		}
			
		System.out.println("str1 length "+str1Length);
		System.out.println("str2 length "+str2Length);
	}

}
