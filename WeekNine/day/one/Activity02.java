package day.one;

import java.util.ArrayList;

public class Activity02 {
	//Create and ArrayList of type double. 
	// and add some value. 
	// print size. 
	// print elements one by one. 
	public static void main(String[] args) {
	
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		numbers.add(12.31);
		numbers.add(43.21);
		
		numbers.add(90.31);
		int size = numbers.size();
		numbers.add(3, 500.0);
		//Get first element in ArrayList. 
		double firstElement = numbers.get(0);
		// Get last element in ArrayList.
		double lastElement = numbers.get(numbers.size() - 1);
		System.out.println("Size of the array " + size);
		
		//Array List works with indexes. 
		for (int i = 0; i < numbers.size() ; i ++) {
			double number = numbers.get(i);
			System.out.println(number);
		}
		
		//Any other option to loop through the ArrayList?
		//Recommended option while using Collections. 
		//for each (Enhance Loop)
		for(double number : numbers) {
			System.out.println(number);
		}
		
	}
}
