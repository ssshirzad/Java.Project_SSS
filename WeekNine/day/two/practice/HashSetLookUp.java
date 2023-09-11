package day.two.practice;

import java.util.HashSet;

public class HashSetLookUp {
	
	public static void main(String[] args) {
		
		
		HashSet<String> cars = new HashSet<>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Subaru");
		cars.add("Chevy");
		cars.add("Chevy");
		
		
		
		for(String car : cars) {
			if(car.equals("Honda"))
			System.out.println(car);
		}
		cars.remove("Chevy");
		System.out.println(cars);
		
		
		
	}

}
