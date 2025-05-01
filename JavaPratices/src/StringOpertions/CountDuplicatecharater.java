  package StringOpertions;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class CountDuplicatecharater {

	public static void main(String[] args) {
		String str1="Imranshaik";
		
		//convert to lower case for case-inesensitive
				str1 =str1.toLowerCase();
		
		//create a map to store word frequencies
				Map<Character, Integer>charCount=new HashMap();
		
		//count characters 
				for(char c : str1.toCharArray()) {
					charCount.put(c, charCount.getOrDefault(c, 0)+1);
				}
		
		System.out.println("Duplicate character are :");
		//print duplicate words and there count
		
		for(Map.Entry<Character, Integer>entry: charCount.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"==>"+entry.getValue());
			}

	}
	}
}
