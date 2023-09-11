package day.three;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		// How to Create a HashMap.
		// We have to define 2 data type, first for Keys , Second for Values.
		HashMap<Integer, String> names = new HashMap<>();

		// How to insert data to the map? put(); method and take key and value as
		// arguments.
		names.put(1234, "John");
		names.put(2345, "Alex");
		names.put(3456, "Mohammad");
		names.put(4567, "John");
		
		//If a key a duplicate value will override with old one. 
		names.put(3456, "Ahmad Yama");
		
		//how to retrieve data from Map? get(); method and it take key as argument.
		String name = names.get(2345);
		System.out.println(name);
		
		//how to retrieve all the values from the map. 
		// 1) get the keySet(); method will return Set<> of keys. 
		// 2) loop through each key
		// 3) using the key and get() method retrieve value. 	
		Set<Integer> keys = names.keySet();
		System.out.println(keys.size());
		
		for (int key : keys) {
			System.out.print("Key " + key);
			String value = names.get(key);
			System.out.println(value);
		}

	}
}
