package oops;

class inheritance {
	String name="xyz";
	int eid=101;
	
	public String messege()
	{
		return "name="+name+" ,  eid= "+eid;
	}
}

class single extends inheritance
{
	int age=21;
	public String messege()
	{
		return "name="+name+" ,  eid= "+eid+ " ,  age="+age;
	}
}

public class single_inheritance
{
	public static void main(String...strings)
	{
		single s1=new single();
		String str=s1.messege();
		System.out.println(str);
	}
}