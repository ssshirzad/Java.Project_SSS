package day.one.practice;

import java.util.ArrayList;

public class ArrayListPractice2 {
	public static void main(String[] args) {
		
		ArrayList<String> brand = new ArrayList<>();
		
		
		brand.add("Honda");
		brand.add("Toyota");
		brand.add("Subaru");
		brand.add("Chevy");
		brand.add(0, "Cadilac");
		System.out.println(brand.size());
	
		brand.remove(1);
		
		for(String b : brand) {
			System.out.println(b);
			
		boolean contains = brand.contains("Toyota");
		System.out.println(contains);
		}
		
		
	}

}
