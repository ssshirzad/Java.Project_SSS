package day.one.practice;

import java.util.ArrayList;

public class Activity02 {
	//Create and ArrayList of type double. 
		// and add some value. 
		// print size. 
		// print elements one by one.
	
	public static void main(String[] args) {
		
		ArrayList<Double> values = new ArrayList<>();
		
		values.add(21.33);
		values.add(33.55);
		values.add(22.88);
		
		double index = values.get(2);
		System.out.println("Getting Value using Index " + index);
		
		double lastIndex = values.get(values.size()-1);
		System.out.println("Getting last index " + lastIndex);
		values.add(3, 88.99);
		
		int size = values.size();
		System.out.println("Array Siz: " + size);
		
		for (double value : values) {
			System.out.println("Value: " + value);
			
			for (int i = 0; i < values.size(); i ++) {
				double dig = values.get(i);
				System.out.println("Using for loop: " + dig);
			}
		}
	}
}
