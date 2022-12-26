package Multithreading;

class Java 
{
	private int i;
	public Java(int i)
	{
		this.i=i;
	}
	public int getvalue()
	{
		return this.i;
	}
	public void setvalue(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
}
public class Custom_class {
	public static void main(String[] args) {
		Java j=new Java(12);
		System.out.println(j);
	}
}
