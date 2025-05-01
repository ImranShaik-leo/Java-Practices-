package StringOpertions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstnonRepetedcharcater {

	public static void main(String[] args) {
	 String le="Swiss";
	 
	 Map<Character, Integer>Map=new LinkedHashMap<Character, Integer>();;
	 int count=1;
	 for(int i=1;i<le.length();i++) {
		 if(Map.containsKey(le.charAt(i))) {
			 
			 Map.put(le.charAt(i), count);
		 }else {
			 Map.put(le.charAt(i), Map.get(le.charAt(i))+1);
		 } 
	 }
	 for(Map.Entry<Character,Integer> entry:Map.entrySet()) {
		 if(entry.getValue()==1) {
			 System.out.println("The First now repeated charcater "+entry.getValue());
			 break;
		 }
	 }

	}

}
