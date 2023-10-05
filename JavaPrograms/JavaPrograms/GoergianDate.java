package JavaPrograms;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class GoergianDate {

	public static void main(String[] args) {
		
		int day, month, year;
		GregorianCalendar date = new GregorianCalendar();
		
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		
		System.out.println(day+"-"+month+"-"+year);
	
		

	}

}
