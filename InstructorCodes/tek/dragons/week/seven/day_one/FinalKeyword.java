package tek.dragons.week.seven.day_one;

public class FinalKeyword {
	//final keyword: it's reserved keyword in Java. 
	//final can come with class, with variables and with method. 
	//final class => Inheritance is not allowed/restricted to a final class. 
	//final variable => variable will be assigned only one time. can not re-assign later.
	//final method => can not override (It's Polymorphism Concept). 
	
	public final String name = "Some Name";
	
	public final void changeName() {
		//Can not change the value of name variable
		//since the variable is final
		//name = "Something else";
		
		final String someVariable = "Something";
		
		System.out.println(someVariable);
	}
}
