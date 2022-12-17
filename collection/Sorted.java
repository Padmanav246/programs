package collection;
import java.util.*;
public class Sorted {
	public static void main(String...strings)
	{
		SortedMap<Integer,String> str=new TreeMap<>(Collections.reverseOrder());
		//adding elements on sorted map .
		str.put(1, "Bmw");
		str.put(2, "Audi");
		str.put(3, "Mercides");
		System.out.println(str);
		
		//changing Elements on sortedmap
//		str.put(2,"Toyota");
//		System.out.println(str);
//		
//		//Removing Elements on SortedMap
//		//str.remove(1);
//		System.out.println(str);
		
		//itereting in sortedmap
		for(Map.Entry mapElement:str.entrySet())
		{
			int keys=(int)mapElement.getKey();
			String value=(String)mapElement.getValue();
			System.out.println(keys+" : "+value);
		} 
		
		//compartor method in sortedmap
		System.out.println("The first key is :- "+str.firstKey());
		
		
		//head map method
		System.out.println("Head map is "+str.headMap(0));
		
		
		//Keyset method in map
		System.out.println("The Key set is :- "+str.keySet());
		
		//lastkey method in map
		System.out.println("Last key on the map :- "+str.lastKey());
		
		
		//Submap method in the map
		//System.out.println("Elements in renge 1 to 2 :- "+str.subMap(0, 1));
		
		
		//tailmap method in map
		System.out.println("tail method:- "+str.tailMap(2));
		
		
		//values method in the map
		System.out.println("the values in the map is :- "+str.values());
		
	}
}