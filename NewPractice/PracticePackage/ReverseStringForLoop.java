package PracticePackage;

public class ReverseStringForLoop {

	public static void main(String[] args) {

		String original = "Good";
		String reverse = " ";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);

		}
		System.out.println(reverse);

	}

}
