package tek.dragons.week.nine.day_two;

import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Rustam");
		names.add("Alex");
		names.add("John");
		names.add("Sora");
		names.add("Tamana");
		names.add("Husnia");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("-----------------------");
		TreeSet<Integer> numbers = new TreeSet<>(); 
		numbers.add(123);
		numbers.add(453);
		numbers.add(5231);
		numbers.add(3212);
		numbers.add(123);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}
}
