package review;

public class Activity6 {
public static void main(String[] args) {
	String paging = "1 - 10 of 4697";
	int indexOfOf = paging.indexOf('f');
	String totalRows = paging.substring(indexOfOf +1);
	// trin() will remove trailing and leading space
	// not the middle of string
	String trimed = totalRows.trim();
	System.out.println("Total Rows:" + totalRows);
	
}
	

	

}
