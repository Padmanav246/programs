package Multithreading;
import java.util.*;

public class Byusingthreadclass {
	public static void main(String[] args) {
		Thread t1=new Thread("My First Thread");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
		 
	}
}
