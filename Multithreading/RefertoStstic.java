package Multithreading;
interface Sayable
{
	void say();
}

public class RefertoStstic {
	public static void saySomthing()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Sayable sb=RefertoStstic::saySomthing;
		sb.say();
	}
}