package tek.dragons.week.two_review;

public class Activity4 {
	//Activity. 
	// variable pagination = "1110 – 1120 of 4697";
	// write a code to extract total number of rows. 4697
	public static void main(String[] args) {
		String pagination = "1110 – 1120 of4697";
		
		int index = pagination.indexOf("of");
		String totalRows = pagination.substring(index + 2);
		//trim() will remote trailing and leading space. 
		//not in middle of string. 
		String trimed =totalRows.trim();
		System.out.println(trimed);
	}
}
