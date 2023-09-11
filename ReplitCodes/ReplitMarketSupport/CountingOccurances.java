package ReplitMarketSupport;

import java.util.HashMap;

public class CountingOccurances {
	public static void main(String[] args) {
		String text = "Java is easy to learn if practice";
		
		HashMap<Character, Integer> chars = new HashMap();
		for(int i = 0; i < text.length(); i++) {
			if(chars.containsKey(text.charAt(i))) {
				int currentCount = chars.get(text.charAt(i));
				int newCount = currentCount+1;
				chars.put(text.charAt(i), newCount);
			}else {
				chars.put(text.charAt(i), 1);
			}
		
			}
			System.out.print(chars);
		}
	}


