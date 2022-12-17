package collection;

import java.util.*;

public class Arraylist {
	public static void main(String args[]){    
		ArrayList<String> list=new ArrayList<String>(3);
		String car[]= {"Toyota","Kia","Fortuner","Inova","Thar"};
		

		
		
		
		
//		add elements in the arraylist using  "add()"  method
		for(int i=0;i<car.length;i++)
		{
			list.add(car[i]);
		}
		//list.remove("Kia");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Renge rover");
		
		
//		//Remove if condition in arraylist
//		list.removeIf(n -> (n == "Kia"));
		
//		//geting some values from arraylist using "get()"  method
//		for(int i=0;i<car.length;i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		
//		//changing the values on the arraylist
//		list.set(1,"BMW");
		
		
		
//		//removing an element from the arraylist using "Remove()" method
//		list.remove(0);
	
		

		
		
//		Method to add remove all the elements in the arraylist
//		list.removeAll(list2);
		
		
//		//method to remove elements if cirtain codition is true
//		list.removeIf(n -> (n=="Kia"));
		
//		//clear method to clear the elements
//		list.clear();
		
//		//To find the size of the arraylist
//		System.out.println(list.size());
		
		
		
		
// 		//simple for loop to ittrete the arraylist objects
//		for(int i=0;i<5;i++)
//		{
//			list.add(car[i]);
//		}	
		
	
		
//		//if the list has previos element
//		ListIterator itr=list.Iterator();
//	while(itr.hasPrevious())
//		{
//		System.out.print(list.Previous()+" ")
//		}
//		
		
		
//		//ittrete through iteretor
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		
		
		//Through For loop ittretion
		for(String str:list)
		{
			System.out.print(str+" ");
		}
		
		
		
		
//	//sorting elements in the arraylist
//	Collections.sort(list);
//	for(String str:list)
//	{
//		System.out.println(str);
//	}
		
		
////		clonning an arraylist
//		ArrayList Arrlist2=(ArrayList)list.clone();
//		System.out.print(Arrlist2);
	
	}
	
} 