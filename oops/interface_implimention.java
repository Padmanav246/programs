package oops;
interface printtable
{

	void print();
	abstract  void show();
}
class interface_implimention implements printtable {

	@Override
	public void print() {
	System.out.println("This is print messge method");
	}

	@Override
	public void show() {
	System.out.println("This Is Show messege");
		
	}
	public static void main(String...strings)
	{
		interface_implimention im=new  interface_implimention();
		im.print();
		im.show();
		
	}
}