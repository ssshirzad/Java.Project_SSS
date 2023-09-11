package tek.dragons.week.seven.day_two;

public class StringFamily {
	// String , StringBuffer , StringBuilder
	// String is Immutable, Mean String Object will not change. and 
	// with every Manipulation it will create new object in memory
	//StringBuffer And String Builder is mutable. 
	
	public static void main(String[] args) {
		String name = "John";
		String lastName = "Smith";
		String fullname = name + lastName; 
		
		String nameUpperCase = name.toUpperCase(); 
		
		String lastNameConcat = lastName.concat(name);
		
		//since Java version 1.0
		//Mutable String It's changeable with same object
		//it's thread safe. slow in performance
		StringBuffer strBuffer = new StringBuffer();
		//append is same as concat
		strBuffer.append("John");
		strBuffer.append(" ");
		strBuffer.append("Smith");
		System.out.println(strBuffer.toString());
		
		//Since java 1.5
		//mutable String It's changeable with same object
		//not thread safe. faster in performance
		StringBuilderPractice strBuilder = new StringBuilderPractice(); 
		strBuilder.append("Alex");
		strBuilder.append(" ");
		strBuilder.append("Murphy");
		System.out.println(strBuilder.toString());
		System.out.println(strBuilder.length());
	}
}
