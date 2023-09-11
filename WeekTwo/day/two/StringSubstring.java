package day.two;

public class StringSubstring {
	public static void main(String[] args) {
		// Substring()
		// To extract part of string as new string
		// SubString method needs index to extract
		
		String text = "Hello World";
		// Hello separate string
		// World separate String
		// Zero to one up
		String helloSub = text.substring(0, 5);
		System.out.println(helloSub);
		
		// the second part of the String
		// the fist index 
		String worldSub = text.substring(6);
		System.out.println(worldSub);
		
		String message = "Title: Good Morning";
		String greetings = message.substring(7);
		System.out.println(greetings);
		
		String city = "Falls Church";
		String citySub = city.substring(0, 5);
		String citySub2 = city.substring(6);
		System.out.println(citySub);
		System.out.println(citySub2);
		
		// you can extract both strings separately 
		// by doing the above
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
