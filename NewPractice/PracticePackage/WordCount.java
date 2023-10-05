package PracticePackage;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		String str = "May peace, mercy and blessings of Allah swt be upon you";

		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String w : str.split(" ")) {
			if(wordCount.containsKey(w)) {
				wordCount.put(w, wordCount.get(w) +1);
			}else {
				wordCount.put(w, 1);
			}
		}
		System.out.println(wordCount);

	}
}
