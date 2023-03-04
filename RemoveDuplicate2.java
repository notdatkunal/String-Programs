package MyPackage;
// I have to remove duplicates from array
import java.util.Arrays;
public class RemoveDuplicate2 {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,5,1,5,6};
		int[]b= new int[0];
		a = check(1,a,b);
			
			System.out.println(Arrays.toString(a));
			
	}
		static int[] check(int index,int[]a,int[] b) {
			int duplicate;
			
				duplicate = a[index-1];
				for(int j = index+1;j<a.length;j++) {
					if(a[j]==duplicate) {
						b = removeduplicate(duplicate,a,j);
						break;
					}
					index +=1;
					if(index==(a.length-1)) {
						return b;
					}
					check(index,a,b);
					
				
				
			}
			return b;
		}
	static int[] removeduplicate(int duplicate, int[] a, int j) {
		int count = 1;
		for(int i = j+1;i<a.length;i++) {
			if(duplicate ==a[i]) {
				count++;
			}
			
		}
		int b[] = new int[a.length-1-count];
		b[0]=duplicate;
		count =0;
		for(int i:a) {
			
			if(i!=duplicate) {
				b[count++]=i;
			}
		}
		return b;
	}
	

}
