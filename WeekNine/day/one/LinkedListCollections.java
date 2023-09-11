package day.one;

import java.util.LinkedList;

public class LinkedListCollections {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		
		System.out.println("Linked List size " + numbers.size());
		
		int number = numbers.get(2);
		System.out.println(number);
		
		numbers.addFirst(50);
		numbers.addLast(600);
		
		//Linked List have method for First Element and Last Element to get them. 
		System.out.println("First Element in Linked List " + numbers.getFirst());
		
		System.out.println("Last Element in Linked List " + numbers.getLast());
	}
}
