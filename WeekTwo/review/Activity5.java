package review;

public class Activity5 {
	public static void main(String[] args) {
		// Activity
		// Variable pagination = 1 - 10 of 4697;
		
		String pagination = "1110 - 11200 of 4697";
		String totalRecord = pagination.substring(10);
		System.out.println("Total Rows:" +' '+ totalRecord);
		
		int paging = pagination.indexOf('f');
		System.out.println(paging);
		
		String pagingTotal = pagination.substring(13+2);
		String trimmed = pagingTotal.trim();
		System.out.println(trimmed);
		
	}

}
