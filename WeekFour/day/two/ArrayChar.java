package day.two;

public class ArrayChar {
public static void main(String[] args) {
	
	char[] letter = {'h', 'e', 'l', 'l', 'o'};
	
	String message = " "+ letter[0] + letter[1] + letter[2] + letter[3] + letter[4]; 
	System.out.println(message.trim());
	
	String hello = String.copyValueOf(letter);
	System.out.println(hello);
	
	String text = new String(letter);
	System.out.println(text);
	
	
}
}
