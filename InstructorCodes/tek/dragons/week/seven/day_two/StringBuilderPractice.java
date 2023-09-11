package tek.dragons.week.seven.day_two;

public class StringBuilderPractice {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("Schafie");
		builder.append(" ");
		builder.append("Shirzad");
		
		System.out.println(builder);
		
		String name = "Schafie Shirzad";
		
		StringBuilder nameBuilder = new StringBuilder(name);
		System.out.println(nameBuilder.reverse());
	}

}
