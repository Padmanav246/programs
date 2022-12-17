package oops;

public class overloaded_constuctor {
	overloaded_constuctor()
	{
		this(10);
		System.out.println("No-arg constructor");
	}
	overloaded_constuctor(int i) 
	{
		this(10.5);
		System.out.println("int-arg");
	}
	overloaded_constuctor(double d) 
	{
		System.out.println("double-arg");
	}
	public static void main(String arg[]) 
	{
		overloaded_constuctor t1 = new overloaded_constuctor();
		overloaded_constuctor t2 = new overloaded_constuctor(10);
		overloaded_constuctor t3 = new overloaded_constuctor(20.5);
		overloaded_constuctor t4 = new overloaded_constuctor('a');
		overloaded_constuctor t5 = new overloaded_constuctor(10l);
	}
}