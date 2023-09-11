package day.one;

public class StudentT {

	// 1. variables - placeholder for your data
	String firstName;
	String lastName;
	int age;

	// 2. methods - functions that your class can perform

	// Constructors - they help you create objects of your class
	// default constructor - is going to initialize an object with default values

	// Access-Modifier Name-of-Class(){ initialize the variables of your class }
	public StudentT() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
	}

	// Parameterized constructor - it will take args and assign that data to the
	// variabels
	// Access-Modifier Name-of-Class(args){ initialize the variables of your class }

	// this
	// keyword this will refer to the scope of the class
	// so saying this.firstName means you are referring to the variable firstName in the class
	
	// refactoring is renaming all of the instances of variable at the same time
	// alt + shift + r
	
	
	// Student("Jack", "Ma", 35)
	public StudentT(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// create a method that print the information of a Student in a nice format
	public void printStudentInfo1() {
		String res = "Student: firsName: " + firstName + ", lastName: " + lastName + ", age: " + age;
		String dashes = "";
		for (int i = 0; i < res.length(); i++) {
			dashes += "-";
		}
		System.out.println(dashes);
		System.out.println(res);
		System.out.println(dashes);
	}

	public void printStudentInfo2() {
		String res = "Student: firsName: " + firstName + ", lastName: " + lastName + ", age: " + age;
		System.out.println(genrateDashes(res.length()));
		System.out.println(res);
		System.out.println(genrateDashes(res.length()));
	}

	// create a method that takes a number as input and returns a string of that
	// many -
	// e.g. 5 = -----
	// e.g. 3 = ---

	public static String genrateDashes(int count) {
		String temp = "";
		for (int i = 0; i < count; i++) {
			temp += "-";
		}
		return temp;
	}
	

}
