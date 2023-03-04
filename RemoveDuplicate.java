package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
	
		int [] arr = new int[sc.nextInt()];
		System.out.println("enter elements in your array");
		for(int i = 0; i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		int[] b = new int[0];
		System.out.println("your array is "+Arrays.toString(arr));
		
		for(int i:arr) {
			if(unique(b,i)) {
			 b = add(b,i);	
			}
			
		}
		System.out.println("your unique array is "+Arrays.toString(b));
	}
	// one method to check for unique
	static boolean unique(int[]b,int n) {
		for(int i:b) {
			if(i==n) {return false;}
		}
		return true;
	}
	
	// one method that will add one index to provided array
	static int[] add(int[] arr,int n) {
		int[] a = new int[arr.length+1];
		a[arr.length]=n;
		int j = 0;
		for (int i: arr) {
			a[j++]=i;
		}
		return a;
	}
}
