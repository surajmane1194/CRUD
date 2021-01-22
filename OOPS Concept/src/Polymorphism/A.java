package Polymorphism;
 //Method Overloading
public class A {
	
		public void m1(int a) {
			System.out.println("Radius of circle is >>"+a);
		}
		public void m1(int a, int b) {
			System.out.println("Area of traingle is >>"+ (a+b));
		}
	public static void main(String[] args) {
		A aa= new A();
		aa.m1(10);
		aa.m1(20, 30);
	}

}
