package tek.dragons.week.eight.day_one;

public class Item {
	private String name; 
	
	//Constructor is used to create object of the class. 
	//Constructor Overloading. 
	public Item() {
		this.name = "";
	}
	
	public Item(String name) {
		this.name = name;
	}
	
	
	public void adding(int first, int second) {
		int result = first + second; 
		System.out.println(result);
	}
	
	public int adding(int first, int second, int third) {
		int result = first + second; 
		System.out.println(result);
		return result;
	}
}
