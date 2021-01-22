package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class A {
	static A x=null;
	static Properties p=null;
	private A() throws Exception {
		System.out.println("I am in Constructor");
		FileInputStream fis= new FileInputStream("C:\\Users\\Supriya\\eclipse-workspace\\OOPS Concept\\src\\singleton\\pqr.properties");
		System.out.println(1);
		Properties p  = new Properties();
		
		System.out.println(2);
		p.load(fis);
		System.out.println(3);
	
	}
	 static synchronized A m1() throws Exception{
	if(x==null) {
		x= new A();
	}
		
		return x;
	}
	 static String m2(String key) {
		String user = 	p.getProperty(key);
		//System.out.println(user);
			return user;
		}

}
