package Multithreading;
import java.util.*;

public class ThreadrunnebleString implements Runnable{
	public static void main(String[] args) {
		Runnable r1=new  ThreadrunnebleString();
		Thread t1=new Thread(r1,"My new thread");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
	}
	public void run()
	{
		System.out.println("Now the thead is running");
	}
}