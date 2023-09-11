package day.two;

import java.util.ArrayList;
import java.util.HashSet;


public class Activity2 {

	// Create an ArrayList of Type String
	// Add some countries. (try to have some duplicate values)	
	// Print all countries one by one
	
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>();
		
		countries.add("USA");
		countries.add("England");
		countries.add("Turkey");
		countries.add("Turkey");
		countries.add("USA");
		countries.add("Mexico");
		countries.add("Spain");
		
		for(String country : countries) {
			System.out.println(country);
		}
		
		// part2) make a unique countries from that list
		// Solution 1) to creat a HashSet and add the values from ArrayList
		// to HashSet one by one.
		HashSet<String> uniqueCountries = new HashSet<>();
		for (String country : countries) {
			uniqueCountries.add(country);
		}
		System.out.println("................................");
		for(String unique: uniqueCountries) {
			System.out.println(unique);
		}
		// solution 2) to use HashSet constructor that accept another collection
		HashSet<String> uniqueCountries2 = new HashSet<>(countries);
		
		System.out.println("--------------------------------");
		for (String uniqueValue : uniqueCountries2) {
			System.out.println(uniqueValue);
		}
		
	}
	

}