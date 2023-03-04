package MyPackage;
import java.util.Scanner;
public class DummyProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many arrays you want to create");
		int[][] arr = new int[sc.nextInt()][];
		for(int i = 0;i<arr.length;i++) {
			System.out.println("enter size of your array");
			arr[i] = new int[sc.nextInt()];
			System.out.println("enter elements in your array");
			for(int j= 0;j<arr[i] .length;j++) {
				arr[i][j]= sc.nextInt();
				
			}
		}// make a method to find min of an array
		int sum = 0;
		for (int i[]:arr) {
			sum +=min(i);
		}
		System.out.println("sum of min in your array is "+sum);
		
		
	}
	
	static int min(int i[]) {
		int min = i[0];
			for(int a:i) {
				min = min>a?a:min;
				
			}		
		return min;
	}
}
