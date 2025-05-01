package StringOpertions;

public class Wordsreversed {

	public static void main(String[] args) {
		String str1="Tosca is good tool";
		String Reversed =Wordsreversed(str1);
		System.out.println(Reversed);

	}

	private static String Wordsreversed(String str1) {
		//split the string into words
		String[] words=str1.split("\\s++");
		
		//use stringbullider
		StringBuilder Reversed = new StringBuilder();
		
		 for(int i=words.length-1;i>=0;i--) {
			 Reversed.append(words[i]);
			 if(i!=0) Reversed.append("");
		    }
		return Reversed.toString();
	}

}
