package oops;
class parent32
{
	private parent32()
	{
		System.out.println("parent constructor");
	}
}

public class private_constructor {
	
	public static void main (String...strings)
	{
		//we can not create the object of the parent class because the constructor is private
		
		//parent p=new parent();
		System.out.println();
	}
}