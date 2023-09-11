package tek.dragons.week.seven.day_one;

public class Output {
	//non-static method
	public void printMessage(String message) {
		
		System.out.println(message);
	}
	
	public static void printError(String message) {
		//calling a non-static method inside the static method is not allowed 
		//unless we create object. 
		//nonStaticVariable = "Something";
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		//to use non-static method we have to create object. 
		Output output = new Output(); 
		output.printMessage("This is from Non Static method");
		
		Output.printError("This is from static method");
	}
}
