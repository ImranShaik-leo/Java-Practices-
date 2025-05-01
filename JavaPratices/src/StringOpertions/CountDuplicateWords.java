package StringOpertions;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str1="My name is imran here name is Imran";
		
		//convert to lower case for case-inesensitive
		str1 =str1.toLowerCase();
		
		//split the string into words
		String[] words=str1.split("\\s");
		
		//create a map to store word frequencies
		Map<String, Integer>wordcount=new HashMap();
		
		//Count word frequencies
		for(String word:words) {
			wordcount.put(word, wordcount.getOrDefault(word, 0)+1);
		}
		System.out.println("Duplicate wored are :");
		//print duplicate words and there count
		
		for(Map.Entry<String, Integer>entry:wordcount.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"==>"+entry.getValue());
			}
		}
	}

}
