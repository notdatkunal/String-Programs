package MyPackage;

import java.util.Scanner;
/*
 * 
 * Design a method to count number of 
 * vowels, consonant, digits, special characters, capital letters, small letters 
 * in the given string.
 * 
 * */
public class Pro3 {
	static int vowel = 0;
	static int consonants = 0;
	static int capital = 0;
	static int small = 0;
	static int digits = 0;
	static int special = 0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a word");
	String str = sc.nextLine();
	Count(str);
	sc.close();
	System.out.println("vowel "+vowel);
	System.out.println("consonants "+consonants);
	System.out.println("capital "+capital);
	System.out.println("small "+small);
	System.out.println("digit "+digits);
	System.out.println("special "+special);
}

static void Count(String s) {
	char[] c =s.toCharArray();
	for(int i = 0;i<c.length;i++) {
		boolean lower = c[i]>96&&c[i]<123;
		boolean upper = c[i]<91&&c[i]>64;
		if(lower) {
			small++;
		}
		if(upper) {
			capital++;
		}
		if(checV(c[i])) {
			// checking for vowels

			vowel++;
			continue;
		}else {
			boolean b = (c[i]<=47)  ||   (c[i]>57&&c[i]<65)   || (c[i]>=58&&c[i]<65) ||(c[i]>122&&c[i]<127);
			if(b) {
				// this one checks for symbols

				special++;
				continue;
				
			}
			if(c[i]>47&&c[i]<=57) {
				// checking for numbers
			
				digits++;
				continue;
			}

			consonants++;
			// checking for vowels
			
			
			
		}
	}

	
	
}
static boolean checV(char a){
	
	char[] b = {'a','e','i','o','u','A','E','I','O','U'};
	for(char i:b) {
		
		if(i==a) {
			return true;
		}
	}
	return false;
}
}
