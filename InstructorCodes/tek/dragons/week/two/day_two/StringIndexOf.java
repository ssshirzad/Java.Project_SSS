package tek.dragons.week.two.day_two;

public class StringIndexOf {
	//String indexOf() method
	//indexOf method we can find the first index 
	//number of specific character. 
	//return int as index number. 
	public static void main(String[] args ) {
		
		String text = "Hello";
		//what is index of H? 0. 
		// what is index of o? 4
		// what is index of l ? 2
		// what is index of L ? -1 means no 'L' in that Text exist.  
		
		int indexOfL= text.indexOf("L");
		System.out.println(indexOfL);
		
		int indexOfH= text.indexOf('H');
		System.out.println(indexOfH);
		
		int indexOfo=text.indexOf('o');
		System.out.println(indexOfo);
		
		int indexOfl=text.indexOf("l");
		System.out.println(indexOfl);
		
		// Activity 
		// String paging = "1 – 10 of 4681";
		// find index number of letter o. 
		String paging = "101 – 110 of 4681";
		int indexOfO = paging.indexOf("of");
		System.out.println(indexOfO);
	}
}
