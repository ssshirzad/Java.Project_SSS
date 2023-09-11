package day.three;

public class ClassTester{
	public static void main(String[] args) {
		
		ClassOne class1 = new ClassOne("Greeting", 123);
		System.out.println(class1.greeting);
		class1.greetGuest();
		System.out.println(class1.number);
		
		ClassTwo class2 = new ClassTwo("Salam", 21);
		
		System.out.println(class2.greeting);
		System.out.println(class2.number);
		class2.greetGuest();
		
		class2.sayGoodbye();
		
		
	}

}
