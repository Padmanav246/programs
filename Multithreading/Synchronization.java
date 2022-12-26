package Multithreading;

class Table
{

	synchronized public void printable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(5);
	}
}

class Thread3 extends Thread
{
	Table t;
	Thread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printable(100);
	}
}
public class Synchronization {
	public static void main(String[] args) {
		Table obj = new Table();  
		Thread1 t1=new Thread1(obj);  
		Thread3 t3=new Thread3(obj);  
		t1.start();  
		t3.start();  
		
	}
}
