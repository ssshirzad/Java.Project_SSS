package day.three;

public class DataTypesSpecification {

	public static void main(String[] args)	{
		int number1 = 102.2 // this shows as an error
		
		// long number should end with L at the end
		long number2 = 123456789123L;
		
		//float numbers should end with an F at the end
		float orangePrice = 1.2F;
		
		byte number3 = 32000; // this will show as error because the byte only has room for 127 numbers. It has to be int
		
		int number3 = 32000;
		
		byte number4 =; // for values you don't know we might as well put int just to be safe.
		
		String date = "01/11/2023"; // this is a string because the formate conains forward slash
		
		char letter =  'A'; // one single character is declared as Char
		
		// F for Female, M for Male 
		char gender = 'f';	
		
		// A B C D E F
		char letter = 'A'; 
		
		// types of declaring variable
		//1) declare and assign right away
		// = is for assignment, one = is for single assignment
		int age = 30; // we declared age and only assigned 30 to it
		// declare only
		int numberA;
		
		//assignment
		int numberA;
		
		//calling variable
		System.out.println(numberA);
	}

}
