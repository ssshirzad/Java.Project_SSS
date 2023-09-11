package tek.dragons.week.five.day_one;

public class InhanceForLoop {
	//Note: 
	// 1) there should be collection (Array) involve.
	// 2) when you are looping through all the elements of the array. 
	
	public static void main(String[] args) {
		int[] numbers = {10 , 20, 30 , 40 , 50};
		
		//Enhance for loops 
		//Declare a variable of arrays data type : which array
		for(int value : numbers) {
			System.out.println(value);
		}
		
		for (int i = 0; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		//reversed for loops. 
		for (int i = numbers.length - 1 ; i >=0 ; i--) {
			System.out.println(numbers[i]);
		}
	}
}
