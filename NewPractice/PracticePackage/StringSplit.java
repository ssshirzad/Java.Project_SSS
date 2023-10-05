package PracticePackage;

public class StringSplit {
	public static void main(String[] args) {
		String str = "How to split strings in java";
		
		String[] strArray = str.split("\\s");
		for(String w: strArray) {
			System.out.print(w+" ");
		}
	

}
}