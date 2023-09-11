package day.three.practice;

public class Activity7 {
	
	public static void main(String[] args) {
		
		String[] cities = {"Fredericksburg", "Richmond", "Washington", "Viena"};
		
		for (int i = 0; i < cities.length; i++) {
			String city = cities[i];
			char charAt = city.charAt(0);{
				if(charAt == 'R') {
					System.out.println(city);
				}
			}
			for (int j = 0; j < cities.length; j++) {
				String city2 = cities[j];
				if(city2.startsWith("W")) {
					System.out.println(city2);
				}
			}
		}
	}

}
