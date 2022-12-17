package collection;
import java.util.*;

public class Treemethods {
	public static void main(String...strings)
	{
		TreeMap<Integer,String> st=new TreeMap<>();
		HashMap<Integer,String> d1=new HashMap<>();
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		String str[]= {"one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		
		for(int i=0;i<str.length;i++)
		{
			d1.put(arr[i], str[i]);
		}
		st.putAll(d1);
		System.out.println(st.containsKey(1));
		System.out.println(st.containsValue("one"));
		System.out.println("The entryset value is "+st.entrySet());
		System.out.println("The First Key is "+st.firstKey());
		System.out.println("The last Key is "+st.lastKey());
		System.out.println("The get Key is "+st.get(1));
		System.out.println("The headmap is "+st.headMap(3));
		System.out.println("The submap is "+st.subMap(1,3));
		//System.out.println("Remove an Element "+st.remove(2));
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.values());
		System.out.println(st.descendingKeySet());
	}
} 