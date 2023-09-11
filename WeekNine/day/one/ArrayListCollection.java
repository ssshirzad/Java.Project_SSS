package day.one;

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		
		//List of int values. 
		//How to Create a List of int values? 
		//Create a new Instance of ArrayList Class. 
		//ArrayList is A Generic Collection.
		//ArrayList only accept non-primitive as Generic Data Type.
		//for all the primitive data type we can use the Wrapper Classes. 
		//int -> Integer
		//long -> Long
		//double -> Double
		ArrayList<Integer> numbers  = new ArrayList<Integer>();
		
		//To get the length/size of an Array List we use size() method.
		System.out.println("Array List Size " + numbers.size());
		
		//How to add numbers to this array list? add() method.
		numbers.add(25);
		numbers.add(100);
		numbers.add(40);
		
		System.out.println("Size after adding " + numbers.size());
		
		//How to get data for an element from the array list? 
		// using get method and passing the index number. 
		int numberOnIndex1 = numbers.get(1);
		System.out.println(numberOnIndex1);
		
		numbers.add(200);
		
		 System.out.println(numbers.size());
	}

}
