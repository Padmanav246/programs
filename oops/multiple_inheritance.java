package oops;
interface vehicle
{
	public void run();
}
interface car
{
	public void wheeals();
}
public class multiple_inheritance implements vehicle,car 
{
	public void run()
	{
		System.out.println("this is running");
	}
	public void wheeals()
	{
		System.out.println("Having 4-wheals");
	}
	public static void main(String...strings)
	{
		multiple_inheritance ml=new multiple_inheritance();
		ml.run();
		ml.wheeals();
	}	
}