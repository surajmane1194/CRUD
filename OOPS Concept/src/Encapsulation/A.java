package Encapsulation;

import java.io.Serializable;

public class A {
	static int x=0;
	public static void main(String[] args) {
	
		boolean b= false;
		if(b=true) {
			System.out.println(x=10+10+x);
			System.out.println(x+2);
		}
		else {
			System.out.println("False");
		}
		System.out.println(x+2);
	}

}
