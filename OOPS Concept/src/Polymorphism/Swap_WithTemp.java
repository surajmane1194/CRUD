package Polymorphism;
//method overriding
public class Swap_WithTemp {
	void m1(int a, int b) {
		int c;
		System.out.println("before swap with temp a="+a);
		System.out.println("before swap with temp b="+b);
		c=a;
		a=b;
		b=c;

		System.out.println("after swap witht temp a="+a);
		System.out.println("after swap with temp b="+b);

	}
	public static void main(String[] args) {
		Swap_WithTemp sw1= new Swap_WithTemp();
		sw1.m1(30, 40);
		Swap_WithoutTemp sw= new Swap_WithoutTemp();
		sw.m1(10, 20);
	}
	
}
class Swap_WithoutTemp {
	void m1(int a, int b) {
		System.out.println("Before swap without temp a="+a);
		System.out.println("Before swap without temp b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap without temp a="+a);
		System.out.println("after swap without temp b="+b);
	}

}