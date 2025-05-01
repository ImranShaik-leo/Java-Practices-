package StringOpertions;

public class CountLenthofstring {

	public static void main(String[] args) {
		String str1="hmake the change o fyou ";
		//counting the the length of the string
		int len= str1.length();
		System.out.println(len);
		
		//Remove the white space in the string
		
     	String 	str2 =str1.replaceAll("\\s","");
     	System.out.println(str2);
     	
     	//now print str2 to find the length of the string after removing white space
     	int len1= str2.length();
     	System.out.println(len1);

	}

}
