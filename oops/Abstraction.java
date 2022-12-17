package oops;

abstract class parent{
	abstract void message();
	public static void messege()
	{
		System.out.println("Hii");
	}
}

class child1 extends parent{
	@Override
	void message() {
		System.out.println("This Is First subclass");
		
	}
	void parent(){}
	
}
class child2 extends parent{
	@Override
	void message() {
	
		System.out.println("This Is Second Subclass");
	}
}
public class Abstraction {
	public static void main(String...strings)
	{
		child1 c1=new child1();
		c1.message();
		child2 c2=new child2();
		c2.message();
	}
	

}
