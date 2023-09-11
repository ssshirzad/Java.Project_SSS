package day.one;

public class StringManipulation {
	public static void main(String[] args) {
	
	// Declaring String Variable 
	// String Literal ==> will be stores in static pool
	String name = "John";
	String name2 = "John";
	
	
	// String Reference ==> will be stores in heap memory
	// String Reference is only allowed for non-primitive data type
	String city = new String("Alexandria");
	System.out.println("Name:" + name);
	System.out.println(city);
	String state = new String("Virginia");
	System.out.println(state);
	}
	
	
	

	}
	

 
