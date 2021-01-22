package singleton;

public class ATest {
	public static void main(String[] args) throws Exception {
		A a= A.m1();
		System.out.println(4);
		String val=a.m2("uname");
		System.out.println(val);
		String val1=a.m2("password");
		System.out.println(val1);
		System.out.println(a);
	}
	
}
