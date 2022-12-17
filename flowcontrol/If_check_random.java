package flowcontrol;
import java.util.Random;

public class If_check_random {
	public static void main(String...strings)
	{
		Random r=new Random();
		int a=r.nextInt();
		if(a<5)
		{
			
			System.out.println(a);	
		}
		else
			System.out.println("This is positive");
	}
}