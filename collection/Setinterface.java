package collection;
import java.util.*;

public class Setinterface {
	public static void main(String...strings)
	{
		Set<Integer> st=new HashSet<Integer>();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			st.add(arr[i]);
		}
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(11);
		l1.add(12);
		st.addAll(l1);
		System.out.println(st);
//		st.clear();
//		System.out.println(st);
		
		System.out.println(st.contains(3));
		
		System.out.println(st.containsAll(l1));
		System.out.println(st.hashCode());
		System.out.println(st.isEmpty());
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		st.removeAll(l1);
//		System.out.println(st);
		
//		st.retainAll(l1);
		Object[] arr1 = st.toArray();
		System.out.println();
		
		
		
	}
}