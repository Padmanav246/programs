package flowcontrol;

public class continue_statement {
	public static void main(String...strings)
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.print(i);
			}
		}
	}
}
