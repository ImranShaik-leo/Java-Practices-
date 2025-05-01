package StringOpertions;

public class NumberofUppercaseletters {

	public static void main(String[] args) {
		String str ="I AM getting NeW job soon";
		int count=0;
		for(char c :str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
