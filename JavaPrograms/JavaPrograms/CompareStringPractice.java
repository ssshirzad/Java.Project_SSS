package JavaPrograms;

public class CompareStringPractice {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		String str2 = "Good Evening";

		int str1Length = str1.length();
		int str2Length = str2.length();

		boolean check = str1.equals(str2);
		System.out.println(check);

		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are not equal");
		}

	}

}
