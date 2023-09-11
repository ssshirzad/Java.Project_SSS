package tek.dragons.week.six.day_two;

public class EncapsulationTesting {
	public static void main(String[] args) {
		Item apple= new Item();
		apple.setName("Red Apple");
		apple.setSize("Normal");
		apple.setPrice(1.23);
		
		System.out.println(apple.getName());
		
		
		Item water = new Item();
		water.setName("Deer Park");
		water.setSize("12Oz");
		water.setPrice(1.34);
		System.out.println(water.getSize());
		
		
		Item meat = new Item("Beef", "1 LB", 17.64);
		System.out.println(meat.getName());
		System.out.println(meat.getSize());
		System.out.println(meat.getPrice());
		
	}
}
