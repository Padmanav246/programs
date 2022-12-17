package collection;
import java.util.*;
public class Vector1 {
	public static void main(String...strings)
	{
		//vector intializing constructor

		Vector<String> vcr=new Vector<String>();
////		Vector<String> vcr=new Vector<String>(12);//intial size
//		Vector<String> vcr=new Vector<String>(12,3);//initial size .//if size increases then how much
		
		//add elements in the vector
		String car[]= {"Toyota","Kia","Fortuner","Inova","Thar"};
		for(int i=0;i<car.length;i++)
		{
			vcr.add(car[i]);
		}
//		2. add(int index,Object o);-----List
		//vcr.add(1,"BMW");
		
//		3. addElement(Object o);-----Vector
//		vcr.addElement("Bmw");
		
		
//		1. remove(Object o);--------Collection
//		vcr.remove("Kia");
		
		
//		2. remove(int index);--------------List
//		vcr.remove(0);
		
//		3. removeElement(Object o);----Vector
//		vcr.removeElement("Inova");
		
		
//		4. removeElementAt(int index);-----Vector
//		vcr.removeElementAt(0);
		
		
//		5. removeAllElements();-----Vector
//		vcr.removeAllElements();
		
		
//		String[] str=new String[7];
//		str[0]="Audi Q3";
//		str[1]="Benz";
//		vcr.copyInto(str);
//		for(String st:str)
//		{
//		System.out.println(st);
//		}
	vcr.forEach(System.out::println);
		
	}
}
