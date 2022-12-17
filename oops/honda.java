package oops;

abstract class bike1
{
	abstract void spead();
}
public class honda extends bike1 {
	void spead()
	{
		System.out.println("Spead is 200");
	}
	public static void main(String...strings)
	{
		bike1  b=new honda();
		b.spead();
	}
}