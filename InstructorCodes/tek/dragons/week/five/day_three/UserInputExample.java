package tek.dragons.week.five.day_three;

public class UserInputExample {
	public static void main(String[] args) {
		UserInput input = new UserInput();
		
		String name = input.getTextInput("Enter your name");
		
		String city = input.getTextInput("Enter your city");
		
		int age = input.getNumberInput("enter your age");
		
		int quantity = input.getNumberInput("Enter apple quantity");
		
		UserOutput output = new UserOutput();
		output.printText(name);
		output.printText(city);
		output.printInt(age);
		output.printInt(quantity);
		
		
		
		
		
		
		
//		//how to get user input for name. 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = scanner.next();
//		
//		// how got get age 
//		System.out.println("Enter your age");
//		int age = scanner.nextInt();
	}
}
