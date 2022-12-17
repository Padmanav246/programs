package oops;

class  dog{

	public void dog1()
	{
		System.out.println("Dog barks");
	}
}
class cat extends dog
{
	public void cat2()
	{
		System.out.println("mow");
	}
}
class inheritance11
{
	public static void main(String...strings)
	{
		cat c=new cat();
		c.dog1();
		c.cat2();
	}
}