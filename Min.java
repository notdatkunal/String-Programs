package MyPackage;

public class Min {
	public static void main(String[] args) {
		int [] arr = {3,2,1,5,6,7};
		int min = arr[0];
		for(int a:arr) {
			min = min>a?a:min;
			
		}	
		System.out.println(min);
	}
}
