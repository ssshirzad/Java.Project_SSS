package tek.dragons.week.six.day_two;

public class TestingCalculator {
	public static void main(String[] args) {
		//Use Calculator class. 
		//Instantiate and object. 
		Calculator object = new Calculator(10 , 20);
		int result = object.addNumbers();
		System.out.println(result);
	}
}
