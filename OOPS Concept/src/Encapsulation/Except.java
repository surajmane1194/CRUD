package Encapsulation;

public class Except {
	int c=10;
	String name;
	String age;
	void m1() {
		int a[]= new int[5];
			
		try {
			int b=c/0;
			System.out.println("I am in try block");
			
			//2.NullPinterException
			
			//3.ArrayIndexOutBoundsException
			
			//4.NumberFormatException
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void pointer() {
		try {
			name.indexOf(name);	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	void format(){
		try {
		 int age=20;			
		} catch (Exception e) {
		System.out.println(e);	
		}
		
	}
	void outof() {try {
		 int a[]= {1,2,3,4,5,6};
	
		System.out.println(a[7]);
	}
	
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Except ex= new Except();
		ex.m1();
		ex.outof();
		ex.pointer();
	}

}
