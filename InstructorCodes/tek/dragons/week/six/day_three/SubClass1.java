package tek.dragons.week.six.day_three;

public class SubClass1 extends SuperClass {
	//If SuperClass have constructor
	// then sub-class should have constructor. 
	//the constructor in sub-class should chain to super-class constructor. 
	public SubClass1() {
		//Constructor Chaining 
		//super() keyword will point to constructor of super-class. 
		//super() have to be first line in the sub-class constructor
		super("Some Name");
	}
	
	public SubClass1(String name) {
		super(name);
	}
}
