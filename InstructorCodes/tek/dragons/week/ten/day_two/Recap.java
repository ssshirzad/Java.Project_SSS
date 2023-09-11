package tek.dragons.week.ten.day_two;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
public class Recap {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		Collections.addAll(numbers, 25,36,16,15,19,10,100);
		//Sort
		Collections.sort(numbers);
		Collections.reverse(numbers);
		
		Collections.sort(numbers , Collections.reverseOrder());
		
		Collections.shuffle(numbers);
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			int number = iterator.next();
			
			if(number % 2 == 0) {
				System.out.println(number + " is even");
			}else {
				System.out.println(number + " is odd");
			}
		}
	}
}
