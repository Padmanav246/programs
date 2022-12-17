package oops;
class inheritance1 {
	String name="xyz";
	int eid=101;
	
	public String messege()
	{
		return "name="+name+" ,  eid= "+eid;
	}
}

class single2 extends inheritance1
{
	int age=21;
	public String messege()
	{
		return "name="+name+" ,  eid= "+eid+ " ,  age="+age;
	}
}

class multilevel extends single2
{
	String address="hydrabad";
	public String messege()
	{
		return "name="+name+" ,  eid= "+eid+ " ,  age="+age+" ,  address="+address;
	}
}
public class multilevel_inheritance {
	public static void main(String... args)
	{
		multilevel mul=new multilevel();
		System.out.println(mul.messege());
	}
}
