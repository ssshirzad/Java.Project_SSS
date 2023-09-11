package tek.dragons.week.four.day_two;

public class ArrayActivity {
	//create an array that can hold 3 String values. 
	// and store your favorite cities. 
	// print all of them. 
	// print the length
	public static void main(String[] args) {
		String[] cities = new String[3];
		//assign values to this array
		cities[0] = "London";
		cities[1] = "Paris";
		cities[2] = "Miami";
		
		//if you exceed the boundary of the array you will get exception. (Error)
		//cities[3] = "Virginia";
		
		// what is I want to store value in index 2 in String variable. 
		String secondFavorite = cities[1];
		String firstFavorite = cities[0];
		String thirdFavorite = cities[2];
		
		System.out.println("Lenght of the array " + cities.length);
		
		System.out.println(firstFavorite);
		System.out.println(secondFavorite);
		System.out.println(thirdFavorite);
		
		cities[2] = "";
		System.out.println("after update " + cities[2]);
	}
}
