package day.two.practice;

public class Activity7 {
	// declare below array. 
		// char[] characters = {'h' , 'e' ,'l', 'l' ,'o' }
		// Create the String "hello" from this array. 
		// then print it. 
	public static void main(String[] args) {
		
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		
		String hello = String.valueOf(chars);
		
		System.out.println(hello);
		
		String text = String.copyValueOf(chars);
		System.out.println(text);
		
		String text2 = new String(chars);
		System.out.println(text2);
	}

}
