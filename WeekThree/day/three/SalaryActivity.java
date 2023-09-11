package day.three;

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
		int workedHour = 96;
		double salary = hourlyPayRate * workedHour;
		System.out.println("Salary before tax " + salary);
		if (salary <= 1000) {
			salary -= salary * 2 / 100;
		} else if (salary > 1000 && salary <= 50000) {
			salary -= salary * 10 / 100;
		} else if (salary > 50000) {
			salary -= salary * 35 / 100;
		}
		System.out.println("Salary after Tax " + salary);
	}
}
