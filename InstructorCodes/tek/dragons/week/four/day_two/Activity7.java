package tek.dragons.week.four.day_two;

public class Activity7 {
	public static void main(String[] args) {
		String[] cities = {"Alexandria" , "Falls Church" , "San Diego" , "Los Angles"};
		// only print the cities start with letter F. 
		// start point is index 0; 
		// what the end point => array.length
		// increment
		for(int index = 0; index < cities.length ; index ++) {
			String city = cities[index];
			char firstChar = city.charAt(0);
			if (firstChar == 'F' || firstChar == 'f') {
				System.out.println(city);
			}
		}
	}
}
