package day.three;

public class AccessModifier {
	//public access modifier: variable, method, constructor or class is publicly 
	//Accessible in all the project. 
	public String publicString = "this is public";
	
	//private access modifier: variable, method, constructor is ONLY accessible
	//in the SAME CLASS
	private String privateString = "this is private";
	
	//protected access modifier variable, method, constructor is Only
	// Accessible to classes in the same package.
	protected String protectedString = "This is protected";
	
	//default access modifier variable, method, constructor is Only
	//Accessible to classes in the same package.
	String defaultString = "This is Default";
}
