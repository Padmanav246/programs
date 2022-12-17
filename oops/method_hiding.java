package oops;

//static method can be overridden by static methods.

class parentp1
{
	static void m1() {System.out.println("This Is a Static method");}
}
public class method_hiding extends parentp1 {
	static void m1() {System.out.println("This is main method");}
	
}
