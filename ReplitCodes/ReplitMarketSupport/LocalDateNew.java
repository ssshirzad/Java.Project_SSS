package ReplitMarketSupport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateNew {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current date and time is: "+currentDateTime);
		
		//Seperate date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date is: "+ currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time is: "+ currentTime);
	}

}
