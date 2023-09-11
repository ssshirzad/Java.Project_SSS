package day.two.practice;

public class Activity2A {
	public static void main(String[]args) {
		int yourGrade =71;
		int minGrade = 70;
		int maxGrade = 85;
		
		if(yourGrade > minGrade && yourGrade <= maxGrade) {
			System.out.println("You've passed with grade: "+ yourGrade);
		}else {
			System.out.println("You've failed with grade: "+ yourGrade);
		}
		
	}
	

}
