package tek.dragons.week.seven.day_one;

public class StaticVariableExample {
	//Constants Variables. every variable that is static and final called constants
	//Constants variable should call in static way. 
	public static final String CONSTANTS_VARIABLE = "This is constants";
	
	public static void main(String[] args) {
		Human tamana = new Human(); 
		tamana.name = "Tamana";
		
		System.out.println(tamana.name);
		
		Human fardeen = new Human(); 
		fardeen.name = "Fardeen";
		System.out.println(fardeen.name);
		
		fardeen.name = "Mr. Fardeen";
		
		Human.isWalking = true; 
		//is better to access static variable in static way
		System.out.println(tamana.isWalking);
		
		System.out.println(fardeen.isWalking);
		
		tamana.isWalking = false; 
		
		System.out.println("Fardeen " + fardeen.isWalking);
	}
}
