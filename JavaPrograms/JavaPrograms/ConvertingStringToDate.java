package JavaPrograms;

import java.util.Date;

public class ConvertingStringToDate {
	public static void main(String[] args) {
		String str="2015-03-31";
		Date date=Date.valueOf(str);//converting string into sql date
		System.out.println(date);
		}

}
