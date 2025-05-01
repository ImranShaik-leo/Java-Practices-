package StringOpertions;

public class ReversThewords {

	public static void main(String[] args) {
		String w="My name is imran here name is Imran";
		
		//split the string into words
				String[] words=w.split("\\s++");
				
		//print words in revers 
				System.out.println("revers words");
				
			    for(int i=words.length-1;i>=0;i--) {
			    	System.out.println(words[i]+"");
			    }

	}


}
