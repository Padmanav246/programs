package flowcontrol;

public class while_loop {
	public static void main(String...strings)
	{
		int i=0;
		while(i<5)
		{
			int j=0;
			while(i>=j)
			{
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
