package day.two;

public class StringIndexOf {
	public static void main(String[] args) {
	
	// String indexOf() method
	// indexOf method we can find the fist index 
	// number of specific character
	// returns int as index number
	
	String text = "Hello";
	// what is index of H? 0
	// what is index of O? 4
	// what is index of L? 2
	// If there is no character you're looking 
	// the index for, it will return -char
	
	int indexOfH = text.indexOf('H');
	System.out.println(indexOfH);
	
	int indexOfO = text.indexOf('e');
	System.out.println(indexOfO);
	
	int indexOfL = text.indexOf('l');
	System.out.println(indexOfL);
	
	int indexOf1 = text.indexOf('o');
	System.out.println(indexOf1);
	
	}
	

}
