package day.one.practice;

import java.util.ArrayList;

public class ArrayListPractice {
public static void main(String[] args) {
	
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> numbers = new ArrayList<>();
	ArrayList<Double> digits = new ArrayList<>();
	
	
	names.add("Mohammad");
	names.add("Abu Bakr");
	names.add("Omar");
	names.add("Usman");
	names.add("Ali");
	
	numbers.add(200);
	numbers.add(1, 300);
	
	digits.add(21.99);
	
	int size = names.size();
	names.remove(0);
	names.add(0, "Ahmad");
	names.get(3);
	names.clear();
	boolean name = names.equals("Omar");
	
	
	
}
}
