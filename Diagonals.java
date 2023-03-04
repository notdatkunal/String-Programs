package MyPackage;
import java.util.Scanner;
public class Diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of your array");
		int size = sc.nextInt();
		String msg = 	""" 
						the array is going to be square shaped 
						thus you have to enter size for only once
						""";
		System.out.println(msg);
		System.out.println("ente elements in your array");
		int [][] a = new int[size][size];
		for(int i = 0; i<a.length;i++) {
			
			for(int j = 0;j<a[i].length;j++) {
				a[i][j]= sc.nextInt();
				
			}
		}
		print(a);
		printdiffOfDiagonals(a);
		System.out.println("sum of diagonals is "+sumOfDiagonals(a));
		System.out.println("sum of diff of all diagonals is "+diffOfDiagonals(a));
		sc.close();

	}
	static void print(int[][]a) {
		System.out.println();
		for(int i[]:a) {
			System.out.print("[ ");
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("]");
		}
	}
	static int sumOfDiagonals(int[][]a) {
		int sum = 0;
		// sum of its diagonals
				for(int i = 0; i<a.length;i++) {
					
					sum += a[i][i]+a[i][a.length-1-i];
					
				}
				if(a.length%2!=0){
					int n=(a.length-1)/2; 
					sum -= a[n][n];}
		return sum;
	}
	static int diffOfDiagonals(int[][]a) {
		int diff = 0;
		// sum of its diagonals
				for(int i = 0; i<a.length;i++) {
					
					diff += a[i][i]-a[i][a.length-1-i];
					
				}
				if(a.length%2!=0){
					int n=(a.length-1)/2; 
					diff += a[n][n];}
		return diff;
	}
	
	static void printdiffOfDiagonals(int[][]a) {
		
		// sum of its diagonals
		System.out.print("\ndiff between diagonals is [ ");
				for(int i = 0; i<a.length;i++) {
					
						int n = a[i][i]-a[i][a.length-1-i];
			 		System.out.print((n<0?n*-1:n)+" ");
					
				}
				System.out.println("]");
				
	}

}
