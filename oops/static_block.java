package oops;

public class static_block {
	// First Static Block is being exicuted then main method
	static{
		System.out.println("Static Block is involked");
	}
	
	public static void main(String...strings)
	{
		System.out.println("Main Method");
	}
	
}
