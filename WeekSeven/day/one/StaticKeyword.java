package day.one;

public class StaticKeyword {
	public static void main(String[] args) {
		Human obj1 = new Human(); 
		obj1.name = "John";
		System.out.println(obj1.name);
		
		Human obj2 = new Human(); 
		obj2.name = "Alex";
		System.out.println(obj2.name);
		
		//Static variable belong to class not to an object. 
		// we can refer to static variables using static way. 
		// static way means ClassName.VariableName
		Human.isWalking = true; 
		
		System.out.println(Human.isWalking);
		System.out.println("Object 1 " +  obj1.isWalking);
		System.out.println("Object 2 " + obj2.isWalking);
		
		obj2.isWalking = false; 
		System.out.println(Human.isWalking);
		System.out.println("Object 1 " +  obj1.isWalking);
		System.out.println("Object 2 " + obj2.isWalking);
	}
}
