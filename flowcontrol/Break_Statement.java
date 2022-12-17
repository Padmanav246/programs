package flowcontrol;

public class Break_Statement {
	public static void main(String...strings)
	{
		for(int i=0;i<10;i++)
		{
			if(i==9)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
