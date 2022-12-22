package task_on_collection;
import java.util.*;
class Function
{
	public String[] sort()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Size Of The Array :- ");
		int size=Sc.nextInt();
		String str[]=new String[size];
		System.out.println("Enter The Strings :- ");
		for(int i=0;i<size;i++)
		{
			str[i]=Sc.next();
		}
		return str;
	}
}
public class Question18 {
	public static void main(String[] args) {
		String str[]= {"Pintu","Padmanav","Chintu","sani"};
		Arrays.sort(str);
		for(String s:str)
		{
		System.out.println(s);
		}
	}
}
