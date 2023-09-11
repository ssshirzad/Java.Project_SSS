package day.two;

public class Activity2 {
	// declare and assign variable grade = 75
	// check/print grade is greater than equal 70 and less than equal 80; 
	public static void main(String[] args) {
		int grade = 71; 
		int passingGrade = 75;
		int failingGrade = 70;
		boolean checkGrade = grade >= passingGrade; 
		boolean checkGrade2 = grade >= failingGrade && passingGrade <= passingGrade;
		System.out.println("Passed: " + checkGrade2);
	}
}
