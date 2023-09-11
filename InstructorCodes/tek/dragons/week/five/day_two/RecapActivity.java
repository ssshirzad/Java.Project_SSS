package tek.dragons.week.five.day_two;

public class RecapActivity {
	public static void main(String[] args) {
		String text = "welcome";
		// reverse this String.
		char[] characters = text.toCharArray();
		int length = characters.length;
		String reverse = "";
		// reverse for loop.
		for (int i = length - 1; i >= 0; i--) {
			reverse += characters[i];
		}

		System.out.println(reverse);
	}
}
