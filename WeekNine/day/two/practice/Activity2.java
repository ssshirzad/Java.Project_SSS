package day.two.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Activity2 {
 
	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>();
		
		countries.add("Afghanistan");
		countries.add("Pakistan");
		countries.add("Tajikistan");
		countries.add("Uzbakistan");
		countries.add("Afghanistan");
		
		for (String country : countries) {
			System.out.println(country);
		}
		
		HashSet<String> uniqueCountries = new HashSet<>();
		
		for (String unique : countries) {
			uniqueCountries.add(unique);
		}
		System.out.println(".........................");
		for (String uniqueValue : uniqueCountries) {
			System.out.println(uniqueValue);
		}
		
		HashSet<String> uniqueCont = new HashSet<>(countries);
		System.out.println("============================");
		for (String u : uniqueCont) {
			System.out.println(u);
		}
	}
}
