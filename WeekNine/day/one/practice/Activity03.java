package day.one.practice;

import java.util.ArrayList;

public class Activity03 {
	//Create and ArrayList of type String. 
	//Add Some Cities to the ArrayList. 
	//And Print only those cities starting with letter A. 
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Alexandria");
		cities.add("Fredricksburg");
		cities.add("Stafford");
		cities.add("Alberta");
		cities.add(0, "falls church");
		
		for (String city : cities) {
			if (city.startsWith("A")) {
				System.out.println(city);
			}
		}
		for (String city2 : cities) {
			if (city2.charAt(0)== 'F' || city2.charAt(0) == 'f') {
				System.out.println(city2);
			}
		}
		cities.clear();
		boolean isEmpty = cities.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println(cities.size());
	}

}
