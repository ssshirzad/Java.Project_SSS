package tek.dragons.week.nine.day_three;
import java.util.TreeMap;
public class Activity3 {
	//String text = "Hello World"; 
	//Find how many time each letter repeat in above String. 
	//print them in alphabetic order. 
	// o -> 2 
	// l -> 3
	//hint: convert String to char[] first. 
	//hint: if there is no value for a given key get() will return null
	public static void main(String[] args) {
		String text = "if there is no value for a given key";
		
		//1) we need a Map 
		TreeMap<Character, Integer> alphabetCounterMap = new TreeMap<>();
		
		//Convert the String to char[]; 
		char[] characters = text.toCharArray();
		
		for(char eachChar : characters) {
			Integer count = alphabetCounterMap.get(eachChar);
			if (count == null) {
				alphabetCounterMap.put(eachChar, 1);
			}else {
				alphabetCounterMap.put(eachChar, count + 1);
			}
		}
		
		for(char key : alphabetCounterMap.keySet()) {
			int value = alphabetCounterMap.get(key);
			System.out.println(key + " -> " + value);
		}
		
	}
}
