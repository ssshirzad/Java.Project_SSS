package day.three;

public class Example1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//every try/catch block can have 1 finally block as optional.
		try {
			System.out.println("Enter your age");
			int age = scanner.nextInt();
			System.out.println("your age is " + age);

		} catch (RuntimeException exception) {
			System.out.println("You have to enter number for age");
		} finally {
			//finally block: no matter try block execute successfully
			// or try block catch an exception finally block will execute. 
			System.out.println("Finally Block executed.");
			scanner.close();
		}
		
		System.out.println("Code end here");
	}
}
