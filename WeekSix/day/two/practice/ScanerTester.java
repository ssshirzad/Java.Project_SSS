package day.two.practice;

public class ScanerTester {
	
	public static void main(String[] args) {
	Scaner scan = new Scaner();
	
	String name = scan.getNameInput("Enter Name");
	int age = scan.getAgeInput("Enter Age");
	String religion = scan.getReligionInput("Enter Religion");
	
	System.out.println(name +" "+ age+ " "+ religion);
	
	}
	
	


}
