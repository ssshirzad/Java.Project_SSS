package NewPractice;

public class StringPractice {
	public static void main(String[] args) {
		String name = "Ghulam";
		String name2 = "Ghulam";
		
		boolean contains = name.contains(name2);
		System.out.println(contains);
		
		String fullName = "Ghulam Dastageer";
		
		String firstName = fullName.substring(0, 6);
		String lastName = fullName.substring(7);
		System.out.println(firstName);
		System.out.println(lastName);
		
		boolean doesEqual = name.equals(name2);
		System.out.println(doesEqual);
		
	}

}
