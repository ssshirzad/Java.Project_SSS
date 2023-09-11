package day.three;

public class ClassOne {
	
	public String greeting;
	public int number;
	
	public ClassOne(String greeting, int number) {
		this.greeting = greeting;
		this.number = number;
	}
	public void greetGuest() {
		System.out.println("Good morning");
	}
	public void sayGoodbye() {
		System.out.println("Have a nice day");
	}

}
