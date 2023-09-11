package tek.dragons.week.ten.day_one;

public class Book {
	//encapsulated Book 
	private long id;
	private String name;
	
	public Book(String name) {
		//Generate Random Id and assign name from parameter. 
		this.id = (long) (Math.random() * 10000);
		this.name = name; 
	}
	
	public Book(long id , String name) {
		this.id = id; 
		this.name = name; 
	}
	
	//Setter
	public void setId(long id) {
		this.id = id; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	//Getters 
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
