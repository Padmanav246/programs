package oops;

class super_constructor {
	public int id;
	
	public super_constructor(int i)
	{
		this.id=i;
		System.out.println("Parent constructor is called");
	}

}
class child extends super_constructor
{
	public String name;
	
	public child(int i,String s)
	{
		super(i);
		this.name=s;
		System.out.println("Child Constructor is called");
	}
	
	public String toString()
	{
		return "id = "+id+"name ="+name;
	}
	
	public static void main(String...strings)
	{
		child c1=new child(111,"john");
		System.out.println(c1);
	}
}