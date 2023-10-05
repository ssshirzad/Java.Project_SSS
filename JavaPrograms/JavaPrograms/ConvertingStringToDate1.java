package JavaPrograms;

import java.util.Date;

public class ConvertingStringToDate1 {

	public static void main(String[] args) {
		String dateString = "2015-12-12";
		@SuppressWarnings("deprecation")
		Date date = new Date(dateString);
		System.out.println(date);
	}

}
