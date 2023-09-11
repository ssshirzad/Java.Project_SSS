package day.three;

public class Activity1Mine {
	public static void main(String[] args) {
		 
		String[][] countries = {
				{"Afghanistan", "America", "Canada", "Italy"},
				{"Japan", " China", "Korea", "Thailand"},
				{"Pakistan", "Iran", "Uzbakistan", "Tajikistan"},
				{"Russia", "Ukrain", "Serbia", "Daghestan"}
		};
		
		int rowLenght = countries.length;
		int columnLenght = countries[0].length;
		System.out.println("Row Lenght: " + rowLenght);
		System.out.println("Column Lenght: " + columnLenght);
		
		System.out.println("[0][0] Index: " + countries[0][0]);
		System.out.println("[0][2] Index: " + countries[0][2]);
	
	}

}
