package NewPractice;

public class StringLiteralVsObject {

	public static void main(String[] args) {
		String str = "Kabul";
		String sdr = new String("Kabul");
		
	
		boolean isEqual = str == sdr;
		System.out.println(isEqual);
		
		boolean isEqual2 = str.equals(sdr);
		System.out.println(isEqual2);

	}

}
