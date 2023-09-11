package day.two;

public class EscapeSequence {
	
	public static void main(String[] args) {
		// System.out.prinln("This is "Schafie""); // won't allow this
		System.out.println("This is \"Schafie\" Shirzad"); // back stash is the escape character
		
		// \ before every symbol or sign you want to print which java don't allow
		System.out.println("These are double qoutes \"\" ");
		
		// if you want to print \ add a second one
		System.out.println("This is backslash \\");
		
		System.out.println("What do you mean \"Stinky\"");
		System.out.println("The file is located at ~\\Desktop\\FunnyCatPics");
		System.out.println("This is a tab \t!");
		System.out.println("This \n is \n on \n multiplelines");
	}

}
