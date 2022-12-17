package oops;
class parent12
{
	void replay()
	{
		System.out.println("parent method");
	}
}
public class dynamic_binding extends parent12{
	void replay()
	{
		System.out.println("This is child in dynamic");
	}
	public static void main(String...strings)
	{
		dynamic_binding d1=new dynamic_binding();
		d1.replay();
	}
}
