package logical;

public class Revese_string {
	public static void main(String[] args) {
		String name="Suraj";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.println("1");
			//char a= name.charAt(i);
			//System.out.println(a);
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
