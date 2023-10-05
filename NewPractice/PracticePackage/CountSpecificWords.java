package PracticePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountSpecificWords {
	public static void main(String[] args) {
		String str = "How to count count specific words in a string";
		
		str = str.toLowerCase();
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : str.split(" ")) {
			if(word.equals("count")) {
				wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			}
		}
		
		for(Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println("Word "+ entry.getKey() + " appears "+ entry.getValue() + " times in bellow string:  \n"+ str);
			
		}
		System.out.println(wordCount);


	}
}
