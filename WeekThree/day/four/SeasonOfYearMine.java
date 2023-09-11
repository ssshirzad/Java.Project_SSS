package day.four;

public class SeasonOfYearMine {
	public static void main(String[] args) {
		
		int month = 3;
		
		if (month == 1 || month == 2 || month == 3) {
			System.out.println("Summer");
		}else if (month == 4 || month == 5 || month == 6) {
			System.out.println("Winter");
		}else if (month == 7 || month == 8 || month == 9) {
			System.out.println("Fall");
		}else if (month == 10 || month == 11 || month == 12) {
			System.out.println("Spring");
		} else {
			System.out.println("Wrong Entry");
		}
	}

}
