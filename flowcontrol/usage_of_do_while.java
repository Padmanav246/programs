package flowcontrol;

public class usage_of_do_while {
	public static void main(String...strings)
	{
		int i=1;
		//while the the condition is true
		
		
		do {
			System.out.print("  "+i);
			i++;
		}while(i<10);
	
	
		
		//while the condition is false
		
		do
		{
			System.out.println("  "+i);
			i++;
		}while(i>10);
	}
}
