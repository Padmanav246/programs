package oops;
class Rectangle
{
	private int Length;
	private int Breadth;
	
	public void setRectangle(int length, int breadth) 
	{
		this.Length=length;
		this.Breadth=breadth;
	}
	
	public int getarea()
	{
		return Length*Breadth;
	}
}


class Square{
	private int side;
	
	public void setside(int side)
	{
		this.side=side;
	}
	public int getarea()
	{
		return side*side;
	}
}

public class datahiding {
	public static void main(String...strings)
	{
		Rectangle r1=new Rectangle();
		r1.setRectangle(10, 20);
		Square s1=new Square();
		s1.setside(10);	
		System.out.println(r1.getarea());
		System.out.println(s1.getarea());
	}

}
