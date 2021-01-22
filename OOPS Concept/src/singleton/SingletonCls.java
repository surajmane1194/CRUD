package singleton;

public class SingletonCls {
	static SingletonCls cls=null;
	private SingletonCls() {
		System.out.println("I am in constructor");
	}
	public static synchronized SingletonCls m1() {
	System.out.println(1);
		if (cls==null) {
		System.out.println(2);
		cls= new SingletonCls();
	}
		return cls;
	}
	
}
