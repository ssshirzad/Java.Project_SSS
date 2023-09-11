package day.one.practice;

import java.util.ArrayList;

public class ShoesRunner {
	
	public static void main(String[] args) {
		
		ArrayList<Shoes> myShoes = new ArrayList<>();
		
		Shoes tjtj = new Shoes("TjTj");
		Shoes nike = new Shoes("Nike");
		Shoes underArmor = new Shoes("underArmor");
	
		myShoes.add(tjtj);
		myShoes.add(nike);
		myShoes.add(underArmor);
		
		

		for (Shoes Shoes : myShoes) {
			System.out.println(Shoes.getBrand());
			
		}
//		for (int i=0; i<myShoes.size(); i++) {
//			Shoes object = myShoes.get(i);
//			System.out.println(object.getBrand());
//		}
		
	}

}
