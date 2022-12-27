package Multithreading;
interface Sayable
{
	void say();
}

public class ReferencetoInstanceMethod {
	public void saySomthing()
	{
		System.out.println("This Is NonStatic");
	}
	public static void main(String[] args) {
		ReferencetoInstanceMethod rf=new ReferencetoInstanceMethod();
		Sayable s=rf::saySomthing;
		s.say();
		 Sayable sayable2 = new ReferencetoInstanceMethod::saySomething;
		 
	}
}
