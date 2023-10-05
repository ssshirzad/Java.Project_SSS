package PracticePackage;

import java.util.Stack;

public class BallancedParenthisis {

	public static void main(String[] args) {
		String sample1 = "((()))()()()";
		String sample2 = "{{}}";
		String sample3 = "[[]]][";
		String sample4 = "<<<>>><>";
		
		System.out.println("sample1? "+isBallanced(sample1));
		System.out.println("sample2? "+isBallanced(sample2));
		System.out.println("sample3? "+isBallanced(sample3));
		System.out.println("sample4? "+isBallanced(sample4));

	}
	public static boolean isBallanced(String str) {
		if(str == null) {
			System.out.println("Invalid Input");
			return false;
		}
		Stack<Character> chars = new Stack<Character>();
		
		for(Character c :str.toCharArray()) {
			if(c == '(') {
				chars.add(c);
			}else {
				if(chars.size() < 1) {
					return false;
				}
				if(c == ')' && chars.pop() != '(') {
					if(c == ']' && chars.pop() !='[')
						if(c == '}' && chars.pop() != '{')
							if(c == '>' && chars.pop() != '<')
					return false;
				}
			}
		}
		return chars.size() ==0;
		
	}

}
