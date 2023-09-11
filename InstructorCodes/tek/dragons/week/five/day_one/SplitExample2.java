package tek.dragons.week.five.day_one;

public class SplitExample2 {
	public static void main(String[] args) {
		String fullName = "Mrs. O'Connell, Paul";
		
		//Split 2 time first with . and then with , 
		String[] splittedByDot = fullName.split("\\.");
		System.out.println(splittedByDot.length);
		String title = splittedByDot[0];
		String names = splittedByDot[1];
		
		//Splitting names with , 
		String[] splittedByComa = names.split(",");
		String firstName = splittedByComa[0];
		String lastName = splittedByComa[1];
		
		System.out.println(title + ".");
		System.out.println(firstName.trim());
		System.out.println(lastName.trim());
		
	}
}
