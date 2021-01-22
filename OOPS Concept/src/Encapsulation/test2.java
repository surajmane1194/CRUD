package Encapsulation;

public class test2 {
	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public static void main(String[] args) {
		test2 t2= new test2();
		t2.setId(1);
		t2.setLocation("pune");
		t2.setName("Maruti");
		System.out.println(t2.id);
		System.out.println(t2.name);
		System.out.println(t2.location);
	}
}
