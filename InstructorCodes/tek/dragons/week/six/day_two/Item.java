package tek.dragons.week.six.day_two;

public class Item {
	private String name; 
	private String size;
	private double price;
	
	//NoArgsConstructor
	public Item() {}
	
	//AllArgsConstructor
	public Item(String name, String size, double price) {
		this.name = name; 
		this.size = size; 
		this.price = price;
	}
	
	//in-direct access with getters and setter. 
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public double getPrice() {
		return this.price;
	}
}
