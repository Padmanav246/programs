package collection;
import java.util.*;
public class Treemap {
	public static void main(String...strings)
	{
		//constructor -1
		//TreeMap<String,String> st=new TreeMap<String,String>();
		
		//constructor -2
		TreeMap<String,String> st=new TreeMap<String,String>(Collections.reverseOrder());
		
		st.put("A", "one");
		st.put("D", "Two");
		st.put("B", "Three");
		st.put("C", "Four");
		
		//constructor -3
		TreeMap<String,String> at=new TreeMap<String,String>(st);

		System.out.println(at);
		System.out.println(at.values());
		System.out.println(at.keySet());
	}
}