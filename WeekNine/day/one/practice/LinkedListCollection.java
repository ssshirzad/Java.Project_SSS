package day.one.practice;

import java.util.LinkedList;

public class LinkedListCollection {
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		LinkedList<Double> numbers = new LinkedList<>();
		
		names.add("Zayed");
		names.add("Asad");
		names.add(0, "Tawab");
		
		numbers.add(22.33);
		numbers.add(55.33);
		numbers.add(11.33);
		System.out.println("--------------------");
		for(double number : numbers) {
			System.out.println(number);
		}
		
		String name = names.get(0);
		System.out.println(name);
		
		String firstIndex = names.getFirst();
		System.out.println(firstIndex);
		
		String lastIndex = names.getLast();
		System.out.println(lastIndex);
		
		System.out.println(names.getFirst());
		
		System.out.println("--------------------");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("---------------------");
		for (double number : numbers) {
			System.out.println(number);
		}
		
		
	}

}
