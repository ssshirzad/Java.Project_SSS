package day.two;

public class Recap {
	//Recap: 
		public static void main(String[] args) {
			//Casting. 
			//Automatic casting (promotion).
			int number = 90;	
			double number1 = 100; 
			
			//Down Casting 
			int number2 = (int) 2.35;
			
			// left side of = is called declaration. 
			// right side of = is called assignment. 
			int number4 = 90; 
			int number5 = 17; 
			double result = (double) number4 / number5; 
			System.out.println(result);
			
			// += , -= , *= , /=;
			
			int total = 0; 
			// option one adding 1 to total variable. 
			total = total + 1; 
			//option two 
			total += 1; 
			
			//option three
			total ++; 
			System.out.println(total);
		}

}
