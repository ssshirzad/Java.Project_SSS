package day.four;

public class Activity3 {
	//Create a method that takes 2 int number as range 
	// then it printing the numbers incrementally by 5;
	// Then create a main method and test your method.
	//example: 0 , 20 ; 0, 5, 10 , 15 , 20
	// 10 minute
	public void printIncrementally(int start, int end, int increment) {
		//to print between a range of number need for loop
		for(int i = start; i <= end ; i += increment) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Activity3 obj = new Activity3();
		//obj.printIncrementally(2, 15 , 1);
		
		obj.printIncrementally(100, 200, 50);
		
	}
}
