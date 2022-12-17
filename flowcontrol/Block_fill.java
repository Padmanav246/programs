package flowcontrol;

public class Block_fill {
	String[] args=new String[12];
	int i=0;
	public static void main(String...strings)
	{
		Block_fill b=new Block_fill();
		b.fill();
		b.fill();
		
	}
	public void fill()
	{
		for(int j=0;j<2;j++)
		{
			args[i]="fill";
			System.out.println(args[i]);
		}
		
	}
	
}
