package tek.dragons.week.six.day_two;

public class UserInputTesting {
	public static void main(String[] args) {
		UserInput input = new UserInput();

		String name = input.getTextInput("Enter your name");
		int age = input.getIntInput("Enter your age");
		double salary = input.getDoubleInput("Enter you Montly Salary?");
		
		input.closeScanner();
		
		System.out.println(name + " with age of " + age + " make " + salary + " per month");
	}
}
