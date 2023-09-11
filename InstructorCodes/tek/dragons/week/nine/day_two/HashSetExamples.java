package tek.dragons.week.nine.day_two;
import java.util.HashSet;
public class HashSetExamples {
	
	public static void main(String[] args) {
		//How to create a new HashSet Instance. 	
		HashSet<String> cities = new HashSet<>();
		
		//How to Add values to HashSet. 
		cities.add("Los Angles");
		cities.add("London");
		cities.add("Alexandria");
		cities.add("Falls Church");
		cities.add("london");
		cities.add("London");
		cities.add("London");
		cities.add("London");
		cities.add("London");
		cities.add("London");
		//how to find out the size of the HashSet. 
		System.out.println("Hash Set size " + cities.size());
		
		//how to get values for the HashSet. 
		//Only way is to Loop through the elements using for each loop. 
		for (String city : cities) {
			System.out.println(city);
		}
		
		//How to remove from HashSet
		cities.remove("Los Angles");
		
		for (String city : cities) {
			System.out.println(city);
		}
	}
}
