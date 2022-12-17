package collection;
import java.util.*;

public class Hashttable {
	public static void main(String...strings)
	{
		Hashtable<Integer,String> h1=new Hashtable<Integer,String>(5);
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		String str[]= {"one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		for(int i=0;i<str.length;i++)
		{
			h1.put(arr[i],str[i]);
		}
		System.out.println(h1.values());		
	}
}