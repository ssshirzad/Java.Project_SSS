package day.two;

public class FindingIndexActivity {
	public static void main(String[] args) {
		String paging = "1 - 10 of 4681";
		int indexOfO = paging.indexOf("of");
		System.out.println(indexOfO);
		int indexOfOo = paging.indexOf('o');
		System.out.println(indexOfOo);
		
		String model = "123 out 321";
		int modelIndex = model.indexOf('o');
		int modelIndex2 = model.indexOf("out");
		System.out.println(modelIndex);
		System.out.println(modelIndex2);
		
	}

}
