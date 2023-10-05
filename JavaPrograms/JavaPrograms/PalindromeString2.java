package JavaPrograms;

public class PalindromeString2 {

	public static void main(String[] args) {
		String original = "ha0nah";
		String reversed = "";
		
		for(int i = original.length()-1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
			if(original.equals(reversed)) {
				System.out.println("String is Palendrome");
			}else {
				System.out.println("String is not Palendrome");
			}
			
		}

	}

}
