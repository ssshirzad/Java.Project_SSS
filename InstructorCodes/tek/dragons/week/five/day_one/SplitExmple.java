package tek.dragons.week.five.day_one;

public class SplitExmple {
	public static void main(String[] args) {
		String fullName = "Mrs. O'Connell, Paul";
		//convert fullName to title, FirstName and LastName Separate String. 
		// 1) Split with white space
		String[] splitedBySpace =fullName.split(" ");
		String title = splitedBySpace[0];
		String firstName = splitedBySpace[1];
		String lastName = splitedBySpace[2];
		
		String firstNameReplaced = firstName.replace(",", "");
		
		System.out.println(title);
		System.out.println(firstNameReplaced);
		System.out.println(lastName);
	}
}
