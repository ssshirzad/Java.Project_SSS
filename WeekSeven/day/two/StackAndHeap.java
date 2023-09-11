package day.two;

public class StackAndHeap {
	//Stack and Heap are both temporary memory 
	//Stack use to store primitive data and reference to objects. 
	// Heap use to store the objects
	//references from stack with have a pointer to their object in heap
	//call stack the method calling in a single stack 
	//order is first in last out
	
	//Java Memory Management 
	public static String STATIC_VARIABLE = "Static";
	
	public static void main(String[] args) {
		
		int a = 10; 
		
		int b = 20; 
		
		int result = a + b; 
		
		System.out.println(result);
		
		String name = "John";
		
		System.out.println(name);
		
		String name2 = "John";
		
		String city = "DC";
		
		System.out.println(name2);
	}
}
