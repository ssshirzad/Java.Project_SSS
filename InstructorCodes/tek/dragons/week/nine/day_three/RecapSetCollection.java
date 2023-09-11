package tek.dragons.week.nine.day_three;
import java.util.HashSet;
import java.util.TreeSet;
public class RecapSetCollection {
	
	public static void main(String[] args) {
		//HashSet<Integer> numbers = new HashSet<>(); 
		TreeSet<Integer>numbers = new TreeSet<>(); 
		numbers.add(345);
		numbers.add(234);
		numbers.add(123);
		numbers.add(123);
		
		System.out.println("Size is  " + numbers.size());
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
	}
}
