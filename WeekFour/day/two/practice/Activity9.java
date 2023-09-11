package day.two.practice;

public class Activity9 {
	//create an array that can hold 3 String values. 
		// and store your favorite cities. 
		// print all of them. 
		// print the length
	
	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		names[0] = "Makah";
		names[1] = "Madina";
		names[2] = "Aqsa";
		
		String first = names[0];
		String second = names[1];
		String third = names[2];
		
		int arrayLength = names.length;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println(arrayLength);
		
		names[2] = "Jeruslum";
		System.out.println(names[2]);
		
		
		
		
		}
	}


