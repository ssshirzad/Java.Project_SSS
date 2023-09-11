package day.three.practice;

public class SalaryActivity {
	// Activity
	// declare and assign variable hourlyPayRate = 16.53;
	// declare and assign variable workedHour = 96;
	// calculate the salary.
	// if salary <= 1000 , take 2% tax out.
	// if salary > 1000 and <= 50000 take 10% tax out.
	// if salary > 50000 take 35% tax out.
	// at the end print the take home salary
	
	public static void main(String[] args) {
		
		double hourlyPayRate = 50;
		int workedHours = 96;
		double salary = workedHours * hourlyPayRate;
		System.out.println("Salary before tax:" + salary);
		double tax = 0;
		
		if(salary <= 1000) {
			tax = salary * 2 /100;
			salary -=tax;	
		}else if(salary > 1000 && salary <= 50000) {
			tax = salary * 10 / 100;
			salary -= tax;
		}else if(salary > 50000) {
			tax = salary * 35 / 100;
			salary -= tax;
		}
		System.out.println("Tax: "+ tax);
		System.out.println("Salary after tax: "+ salary);
		
	}
}
