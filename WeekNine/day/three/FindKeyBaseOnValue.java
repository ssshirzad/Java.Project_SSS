package day.three;

import java.util.Set;
import java.util.TreeMap;

public class FindKeyBaseOnValue {
	public static void main(String[] args) {
		TreeMap<String, Long> population = new TreeMap<>();
		population.put("USA", 380_500_000L);
		population.put("England", 45_000_000L);
		population.put("France", 25_000_000L);
		population.put("Germany", 61_000_000L);
	
		//find the countries will population below 50M
		Set<String> keys = population.keySet();
		for(String key: keys) {
			long pop = population.get(key);
			if (pop < 50_000_000) {
				System.out.println("Country below 50 M Population " + key);
			}
		}
	}
}
