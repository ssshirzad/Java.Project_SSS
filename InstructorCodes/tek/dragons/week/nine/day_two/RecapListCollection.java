package tek.dragons.week.nine.day_two;
import java.util.ArrayList;
import java.util.LinkedList;
public class RecapListCollection {
	public static void main(String[] args) {
		
		ArrayList<String> namesList = new ArrayList<>();
		
		//Add Values to Array? 
		namesList.add("John");
		namesList.add("Alex");
		namesList.add("Sara");
		namesList.add("Mohammad");
		namesList.add("Sora");
		
		//how to find the size of the array. 
		System.out.println("Size of this array list " + namesList.size());
		
		//get 1 element from the array list using index. 
		String name = namesList.get(2);
		
		//Loop Through array list. 
		for (int i = 0 ; i < namesList.size() ; i ++) {
			System.out.println(namesList.get(i));
		}
		
		// for each loop. (recommended)
		for (String value : namesList) {
			System.out.println(value);
		}
		
		//isEmpty() method to check if the ArrayList is Empty or Not? 
		if (namesList.isEmpty()) {
			System.out.println("The list is empty ");
		}else {
			String name1 = namesList.get(0);
			System.out.println(name1);
		}
		
		//How to remove element from an Array.
		//Remove by Index
		namesList.remove(3);
		
		//Remove by value. 
		namesList.remove("Alex");
		
		System.out.println("After removing " + namesList.size());
		
		//LinkedList
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(123);
		numbers.add(4321);
		
		//We can get first element and last element. 
		int firstElement = numbers.getFirst();
		
		int lastElement = numbers.getLast();
		
		//Add to first and Last elements. 
		numbers.addFirst(7980);
		numbers.addLast(891231);
		
		for(int value : numbers) {
			System.out.println(value);
		}
		
	}
}
