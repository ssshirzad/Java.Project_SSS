package JavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Schafie Shirzad";
		
		StringBuilder builder = new StringBuilder(name);
		StringBuilder reversedName = builder.reverse();
		System.out.println(reversedName);

	}

}
