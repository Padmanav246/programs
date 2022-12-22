package Multithreading;
import java.util.*;

class Multithreading extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("thread "+Thread.currentThread().getId()+"  iS running");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Bythreadclass {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			Multithreading mul=new Multithreading();
			mul.start();
			
		}
	}
	
}
