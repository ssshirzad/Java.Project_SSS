package day.two;

public class EncapsulationTesting {
	public static void main(String[] args) {
		Item apple= new Item();
		apple.setName("Red Apple");
		apple.setSize("Normal");
		apple.setPrice(1.23);
		
		apple.printInfor();
		
		
		Item water = new Item();
		water.setName("Deer Park");
		water.setSize("12Oz");
		water.setPrice(1.34);
		apple.printInfor();
		
		
		Item meat = new Item("Beef", "1 LB", 17.64);
		meat.printInfor();
		
	}
}
