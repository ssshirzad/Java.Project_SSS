package day.four.practice;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TodaysDate {
	public static void main(String[] args) {
		
		LocalDateTime todayDate = LocalDateTime.now();
		System.out.println(todayDate);
		
		int day = todayDate.getDayOfMonth();
		System.out.println(day);
		
		DayOfWeek week = todayDate.getDayOfWeek();
		System.out.println(week);
		
		int time = todayDate.getYear();
		System.out.println(time);
		System.out.println(todayDate.getHour());
		System.out.println(todayDate.getClass());
		
		System.out.println(LocalDateTime.now());
	}

}
