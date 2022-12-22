package Multithreading;
import java.util.*;

class Multithread extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
}
public class Byextending {
	public static void main(String[] args) {
		Multithread m1=new Multithread();
		m1.start();
	}
}
