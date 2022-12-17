package oops;
class over
{
	public void m1()
	{
		System.out.println("Hii");
	}
	public void m1(int i)
	{
		System.out.println(i);
	}
	public void m1(int a,int b)
	{
		System.out.println(a+","+b);
	}
}
public class overloading {
	public static void main(String...strings )
	{
		int a=1;
		int b=3;
	over o=new over();
	o.m1(a,b);
	System.out.println();
	}
}