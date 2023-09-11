package tek.dragons.week.nine.day_three;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> countries = new TreeMap<>(); 
		countries.put(10, "USA");
		countries.put(14, "Frence");
		countries.put(8, "England");
		countries.put(20, "Germany");
		
		//Remove from a map. 
		countries.remove(8);
		for(int key : countries.keySet()) {
			System.out.println(key + " : " + countries.get(key));
		}

		//clear() will clear out map. 
		countries.clear();
		
		System.out.println(countries.keySet().size());
	}
}
