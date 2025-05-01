package ArrayOpertions;

public class repeatingelementsinarray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,4,3,2};
		int Temp[]= new int[array.length];
		
		for(int i=0; i<Temp.length;i++) {
			if(Temp[array[i]]==1) {
				System.out.println(array[i]);
			}else {
				Temp[array[i]]++;
			}
		}
	}

}
