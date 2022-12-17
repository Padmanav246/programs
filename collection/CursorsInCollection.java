package collection;

import java.util.*;

public class CursorsInCollection {
	public static void main(String...strings)
	{
		Vector<String> vcr=new Vector<String>();
		String car[]= {"Toyota","Kia","Fortuner","Inova","Thar"};
		for(int i=0;i<car.length;i++)
		{
			vcr.add(car[i]);
		}
		
		
		//Enumaration
//		Enumeration e=vcr.elements();
//		while(e.hasMoreElements())
//		{
//			//System.out.println(e.nextElement());
//		}
//		
		//Iteretor
//		Iterator i=vcr.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next()+" ");
// 		}
		
		
//		ListIterator itr=vcr.listIterator();
//		while(itr.hasNext())
//		{
//			String str=(String)itr.next();
//		}
				
	}
}