package JavaPrograms;

public class ConvertingStringToInt {

	public static void main(String[] args) {
		String numString = "2020";
		
		int stringToInt = Integer.valueOf(numString);
		System.out.println(stringToInt);
		System.out.println(stringToInt + 200);
	}

}
