package collection;
import java.util.*;
import java.util.Map.Entry;
public class Hashmap {
	public static void main(String...strings)
	{
		//constructor declaration 1
		
		HashMap<Integer,String> h=new HashMap<>();
		
		
		//constructor with initial capacity
//		HashMap<Integer,String> h=new HashMap<>(4);
//		System.out.println(h.size());
		
//		 HashMap(int initialCapacity, float loadFactor)
//		Map<Integer,String> h=new HashMap<Integer,String>();
		Integer[] arr= {1,2,3,4,5,6,7,8,9,10};
		String[] str= {"one","two","three","four","five","six","seven","Eight","nine","ten"};
		for(int i=0;i<str.length;i++)
		{
			h.put(arr[i], str[i]);
		}
		
		//Changing the value in the hashmap
		//h.put(10, "Eleven");
		
		//
		for(Entry<Integer, String> e:h.entrySet())
		{
			System.out.println(e);
		}
		
		//clone method in Hashmap
		System.out.println("The shallow copy is :- "+h.clone());
	}
}