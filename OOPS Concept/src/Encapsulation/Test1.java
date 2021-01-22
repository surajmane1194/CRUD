package Encapsulation;

public class Test1 {
	private int id;
	private String  name;
	private int age;

		void setId(int id) {
			this.id= id;
		}
		int getid() {
			return id;
		}
		void setname(String string) {
			this.name= string ;
			
		}
		String getname() {
			return name;
			
		}
		void setage(int a) {
			this.age=a;
			
		}
		int getage() {
			return age;
		}
		public static void main(String[] args) {
			Test1 t= new Test1();
			t.setId(2);
			t.setname("Suraj");
			t.setage(24);
			System.out.println(t.id);
			System.out.println(t.name);
			System.out.println(t.age);
		}
}
