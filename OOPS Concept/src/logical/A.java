package logical;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		String str ="abcdgfhhd";
	     String c;
		System.out.println("Enter any char from str");
		Scanner sc= new Scanner(System.in);
		c=sc.next();
		//System.out.println(c);
		for(int i=0;i<=str.length()-1;i++) {
			char b=str.charAt(i);
			//System.out.println(b);
			if(c==b) {
		     break;
			}else {
				System.out.println("Please enter valid char");
			}
		for (int j=c.indexOf(b);j<=c.indexOf(b)-1;j++) {
			System.out.println(c);
		}	 
		}
		
	}

}
