package Multithreading;
import java.util.*;

class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
public class Sleep {
	public static void main(String[] args) {
		Runnable m1=new Thread2();
		Runnable m2=new Thread2();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();
		t1.start();
		
	}
}