package ArrayOpertions;

import java.util.stream.IntStream;

public class AlternativeElements {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,3,4,5,6,7,8,8,24,66,9,10};
		
		IntStream.range(0, array.length)
		.filter(i->i%2==0)
		.map(i->array[i])
		.forEach(System.out::println);
	}

}
