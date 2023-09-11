package day.two.practice;

public class Activity6 {
	// Activity
		// Declare an array that storing 5 Cities. 
		// and print the all in upper case. 
	public static void main(String[] args) {
		
		String[] cities = new String[5];
		
		cities[0] = "fredericksburg";
		cities[1] = "alexandria";
		cities[2] = "richmond";
		cities[3] = "norfolk";
		cities[4] = "henrico";
		
		
		for (int i = 0; i < cities.length; i++) {
			cities[i].toUpperCase();	
			System.out.println(cities[i]);
		}
		
	}
}
