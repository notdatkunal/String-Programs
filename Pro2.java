package MyPackage;

import java.util.Scanner;

public class Pro2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a word");
	String str = sc.nextLine();
	Pro(str);
	sc.close();
}

static void Pro(String s) {
	char[] c =s.toCharArray();
	for(int i = 0;i<c.length;i++) {
		if(checV(c[i])) {
			c[i]+=1;
		}else {
			boolean b = c[i]<=47||(c[i]>57&&c[i]<65)||(c[i]>58&&c[i]<97)||(c[i]>122&&c[i]<126);
			if(b) {
				
				c[i]='R';
				continue;
			}
			if(c[i]>47&&c[i]<=57) {
				
				c[i]=' ';
				continue;
			}
			c[i]+=2;
			
			
			
		}
	}
	for(char j:c) 
	{
		System.out.print(j);
	}
	
	
}
static boolean checV(char a){
	
	char[] b = {'a','e','i','o','u'};
	for(char i:b) {
		
		if(i==a) {
			return true;
		}
	}
	return false;
}
}
