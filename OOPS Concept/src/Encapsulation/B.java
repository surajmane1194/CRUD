package Encapsulation;

public class B extends A {
	B(){
		System.out.println("Constructor -B");
	}

	@Override
	public void m1() {
		System.out.println("B-M1");
	}

	@Override
	void m3() {
		System.out.println("B-M3");

	}
	public static void main(String[] args) {
		B b= new B();
		b.m3();
		b.m2();
		b.m1();
		
	}

}
