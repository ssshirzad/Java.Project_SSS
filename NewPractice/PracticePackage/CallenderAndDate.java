package PracticePackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;


public class CallenderAndDate {

	public static void main(String[] args) {
		System.out.println("==============Old Way===============");
		Date currentDate = new Date();
		System.out.println("Current Date is: "+currentDate);
		
		Calendar currentDateTime = Calendar.getInstance();
		Date date = currentDateTime.getTime();
		System.out.println("Current Date: "+date);
		System.out.println("Current Date and Time: "+currentDateTime.getTimeZone());
		
		System.out.println("================New Way===============");
		LocalDateTime currentDateTime2 = LocalDateTime.now();
		System.out.println("Current Date and Time is: "+currentDateTime2);
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date: "+ localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time: "+ localTime);
	}

}
