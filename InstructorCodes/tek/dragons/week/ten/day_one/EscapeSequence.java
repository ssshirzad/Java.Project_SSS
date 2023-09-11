package tek.dragons.week.ten.day_one;

public class EscapeSequence {
	public static void main(String[] args) {
		// someone said "We love Java" in a meeting. 
		
		String text = "Someone said \"We Love Java\" in a meeting";
		
		System.out.println(text);
		
		System.out.println("info \t at a tab space");
		
		System.out.println("info \n it goes to next line");
		
		String sentence = "Today was fine. tempreture was rising";
		
		String[] something =sentence.split("\\.");
		
		System.out.println(something[0]);
		System.out.println(something[1]);
	}
}
