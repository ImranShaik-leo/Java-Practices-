package ArrayOpertions;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
	int [] arr = {23,5,6,8,82,2,555,66,72};
	int first =arr[0], second = arr[0] , thrid =arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>first) {
			second=first;
			first=arr[i];
			
		}else if(arr[i]>second) {
			second = arr[i];
		}else if(arr[i]>thrid) {
			thrid = arr[i];
		}
	}
	System.out.println(first+"  "+second+" "+thrid);

	}

}
