package tek.dragons.week.two.day_two;

public class StringValidation {
	public static void main(String[] args) {
		
		//Regular String.
		String name = "Some name";
		
		//String is Empty
		String nameEmpty = "";
		
		//String is Blank
		String nameBlank = "       ";
		
		//String null; 
		String nameNull; 
		
		
		//String Method to check for Empty. 
		boolean nameIsEmpty = nameEmpty.isEmpty();
		System.out.println("Is Empty Method Returns " + nameIsEmpty);
		//isBlank checking for String to Have any character not just Space.
		boolean nameIsBlank = nameBlank.isBlank();
		System.out.println("isBlank method returns " + nameIsBlank);
		System.out.println(nameBlank.length());
		
	}
}
