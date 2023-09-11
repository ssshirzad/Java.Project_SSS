package day.two.practice;

public class StringSub {
	public static void main(String[] args) {
		
		String text = "Salam Alikom, brothers";
		String text2 = "How're you all doing";
		
		int textIndex = text.indexOf(',');
		
		String textSub = text.substring(textIndex+2);
		System.out.println(textSub);
		
		String concat = text.concat(text2 + " ");
		System.out.println(concat);
}

}
