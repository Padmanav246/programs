package ForEach;
import java.util.*;

public class ForEach1 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		for (int i=0;i<10;i++)
		{
			li.add(i);
		}
		for(int a:li)
		{
			System.out.println(a);
		}
	}
}
