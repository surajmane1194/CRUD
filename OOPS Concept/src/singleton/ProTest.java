package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProTest {
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Supriya\\eclipse-workspace\\OOPS Concept\\src\\singleton\\pqr.properties");
	System.out.println(1);
	Properties p= new Properties();
	p.load(fis);
	String val = p.getProperty("uname");
	System.out.println(val);
}
}
