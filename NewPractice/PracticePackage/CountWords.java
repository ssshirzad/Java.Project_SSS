package PracticePackage;

import java.util.HashMap;
import java.util.Map;


public class CountWords {
	
	public static void main(String[] args) {
		
		String str = "How to cound words and chars in a string string";
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : str.split(" ")) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) +1);
			}else {
				wordCount.put(word, 1);
			}
			
		}
		System.out.println(wordCount);
	}
	
	
	public static Map<String, Integer> countOfWords(String str){
		Map<String, Integer> words = new HashMap<String, Integer>();
		
		for(String w : str.split(" ")) {
			if(words.containsKey(w)) {
				words.put(w, words.get(w) + 1);
			}else {
				words.put(w, 1);
			}
		}
		
		return words;
	}

}
