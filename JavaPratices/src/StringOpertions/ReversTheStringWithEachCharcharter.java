package StringOpertions;

public class ReversTheStringWithEachCharcharter {

	public static void main(String[] args) {
		String st1="Hello  IMran Shaik";
				String reversed = reverseString(st1);
				System.out.println("original string" + st1);
				System.out.println("reversed string" + reversed);
	}
	public static String reverseString(String st1) {
		StringBuilder sb = new StringBuilder(st1);
		return sb.reverse().toString();
	}

}
