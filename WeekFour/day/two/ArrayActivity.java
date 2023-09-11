package day.two;

public class ArrayActivity {
	public static void main(String[] args) {
		
		String[] favoriteCity = new String[3];
		
		favoriteCity[0] = "Makah";
		favoriteCity[1] = "Madina";
		favoriteCity[2] = "Aqsa";
		
		System.out.println(favoriteCity[0]);
		System.out.println(favoriteCity[1]);
		System.out.println(favoriteCity[2]);
		
		int cityLenght = favoriteCity.length;
		System.out.println(cityLenght);
	}

}
