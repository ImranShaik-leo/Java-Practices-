package StringOpertions;

import java.util.HashSet;

public class printDuplicatevalues {

	public static void main(String[] args) {
		String str ="imranim";
		
		
		HashSet<Character> seen = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();
		
		for(char ch: str.toCharArray()) {
			if(!seen.add(ch)) {
				duplicates.add(ch);
			}
		}
		
		System.out.println("original string ==>" + str);
		System.out.println("duplicates characters ==>");
		
		for(char ch : duplicates) {
			System.out.println(ch + " ");
		}
	}

}
