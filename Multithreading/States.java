package Multithreading;
import java.util.*;
class Function implements Runnable
{
	@Override
	public void run() {
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
//		System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());  
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class States {
	public static Thread t1;
	public static Function obj;
	public static void main(String[] args) {
		obj = new Function();
		t1 = new Thread(obj);
		System.out.println("The state of the thread after swap is :- "+t1.getState());
		t1.start();
		System.out.println("the State of the thread after invoking start() method is :- "+t1.getState());
		
	}
	public void run()  
	{  
	Function myObj = new Function();  
	Thread t2 = new Thread(myObj);
	System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
	t2.start();  
	
	try  
	{  
		Thread.sleep(200);  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}  
	  
	System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );  
	
	try  
	{  
	// waiting for thread t2 to complete its execution  
	t2.join();  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}  
	System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
	}  
	  
}  
