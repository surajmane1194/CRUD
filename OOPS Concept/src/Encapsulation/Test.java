package Encapsulation;


class encap
{
	private int id;
	
	public
	void setid(int id)//setter
	{
		this.id=id;
	}
	
	int getid()//getter
	{
		return id;
	}
}

public class Test {
	public static void main(String[] args) {
		encap e=new encap();
		e.setid(10);
		System.out.println(e.getid());
	}
}
