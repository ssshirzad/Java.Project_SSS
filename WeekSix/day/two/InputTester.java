package day.two;

public class InputTester {
	public static void main(String[] args) {
		
		Input input = new Input();
		String name = input.getText("Enter Name");
		int age = input.getAge("Enter Age");
		double weight = input.getWeight("Enter Weight");
		
		System.out.println(name + " Age:" + age +" is " + weight+ " Lbs" );
	}

}
