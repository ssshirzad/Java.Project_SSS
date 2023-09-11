package day.four;

public class ActivityThree {
	
	//Create a method that takes 2 int number as range 
		// then it printing the numbers incrementally by 5;
		// Then create a main method and test your method.
		//example: 0 , 20 ; 0, 5, 10 , 15 , 20
		// 10 minute
	
	public void IncrementByFive(int Start, int end, int increment) {
		for (int i = Start; i <=end; i+= increment) {
			System.out.println(i);
		}
	}

}
