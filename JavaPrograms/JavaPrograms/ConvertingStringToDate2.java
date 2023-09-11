package JavaPrograms;

import java.sql.Date;

public class ConvertingStringToDate2 {

	public static void main(String[] args) {
		String stringDate = "2022-01-01";
		
		Date date = Date.valueOf(stringDate);
		System.out.println(date);
		
		

	}

}
