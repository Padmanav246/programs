package objects;
class ObjectEqualsDemo{
	static int a = 10, b=20;
	int c;
	ObjectEqualsDemo()
	{
		System.out.println("Addition of 10 and 20 : ");
		c=a+b;
		System.out.println("Answer : "+c);
	}
}
public class equal {
	public static void main(String args[])
	{
	ObjectEqualsDemo obj1 = new ObjectEqualsDemo ();
	ObjectEqualsDemo obj2 = new ObjectEqualsDemo ();
	System.out.println("Objects are equal:" + obj1.equals(obj2));
	}
}
