package tek.dragons.week.ten.day_two;

public class SingletonClass {
	public String name; 
	//Singleton is technique to only have one instance of a class
	//for entire execution. 
	//To Achieve Singleton 
	// 1) Encapsulation.
	// 2) static method to get instance
	// 3) private constructor to avoid any other class creating new object. 
	// 4) using selection and null check to return new or old object.
	private static SingletonClass object; 
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		if (object == null) {
			object= new SingletonClass();
		}
		
		return object;
	}
	
	
	public void printName() {
		System.out.println(name);
	}
}
