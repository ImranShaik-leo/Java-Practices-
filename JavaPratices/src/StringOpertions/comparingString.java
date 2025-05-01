package StringOpertions;

public class comparingString {

	public static void main(String[] args) {
		String str1 ="Imran leo leo";
		String str2 ="Imran leo    ";
		//Removing white space
		String leo =str1.replaceAll("\\s","");
		
		int str3 =leo.length();
	System.out.println(str3);
		
		if(!str1.equals(str2)) {
			System.out.println("The string is  not equal");
		}else {
			System.out.println("The string are  equal");
		}

	}

}
