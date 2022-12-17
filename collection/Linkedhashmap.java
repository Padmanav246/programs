package collection;
import java.util.*;

public class Linkedhashmap {
	public static void main(String...strings)
	{
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		String str[]= {"one","Two","Three","Five","Six","Seven","Eight","Nine","Ten"};
		
		for(int i=0;i<str.length;i++)
		{
			lh.put(arr[i], str[i]);
		}
		System.out.println(lh);
		System.out.println(lh);
	}
}
