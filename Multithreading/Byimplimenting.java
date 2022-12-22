package Multithreading;
import java.util.*;
class Multithreading1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class Byimplimenting {
	public static void main(String[] args) {
		Multithreading1 m1=new Multithreading1();
		Thread t1=new Thread(m1);
		t1.start();
		
	}
}