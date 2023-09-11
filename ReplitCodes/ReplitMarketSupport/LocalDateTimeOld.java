package ReplitMarketSupport;


import java.util.Calendar;
import java.util.Date;

public class LocalDateTimeOld {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("Current Date is: "+ currentDate);
		
		Calendar calender = Calendar.getInstance();
		Date currentDateWithCalendar = calender.getTime();
		System.out.print(currentDateWithCalendar);
	}

}
