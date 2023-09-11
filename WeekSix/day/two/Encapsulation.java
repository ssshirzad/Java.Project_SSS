package day.two;

public class Encapsulation {
	//Encapsulation: is limiting the access to instance variable 
	// of a class by making them private.
	// and prove access through method. 
	// private access modifier : limit the access for variable, method and constructor
	// to the same class only. 
	//POJO: PLAIN OLD JAVA OBJECT. 
	//POJO use encapsulation concepts. 
	private String name;
	private int age; 
	
	//In order to have in-direct access to encapsulated variables. 
	//we have to create Getters and Setters method for each instance variable. 
	//Setter method is a void method which take one parameter to assign value
	public void setName(String name) {
		//assign the value from parameter to instance variable. 
		this.name = name;
	}
	//getter method is a return type method method returning the value and have no parameters. 
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public int getAge() {
		return this.age;
	}
}
