package tek.dragons.week.nine.day_one;
import java.util.ArrayList;
public class Activity03 {
	//Create and ArrayList of type String. 
	//Add Some Cities to the ArrayList. 
	//And Print only those cities starting with letter A. 
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Alexandria");
		cities.add("Los Angles");
		cities.add("London");
		cities.add("Atlanta");
		
		System.out.println("Size of the array " + cities.size());
		
		//how to find out the ArrayList have some values? 
		//isEmpty() method will return true if ArrayList is Empty
		boolean isArrayEmpty = cities.isEmpty();
		
		if (cities.isEmpty()) {
			System.out.println("This array is Empty");
		} else {
			System.out.println("This Array have some data");
		}
		
		//How to remove an element in index 1; 
		//remove() method takes an index number and will remove the element from the ArrayList
		//this operation will shift left the index numbers.
		cities.remove(0);

		for(String city : cities) {
			if(city.startsWith("A")) {
				System.out.println(city);
			}
		}
		
		System.out.println("Array List size after removal " + cities.size());
	}
}
