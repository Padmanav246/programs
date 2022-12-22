package Multithreading;
import java.util.*;

public class Check {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of the array :- ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		System.out.println("Enter the array Elements ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("After Deleting duplicate elements :-");
		int l=0;
		int j;
		for(int i=0;i<size;i++)
		{
			for(j=0;j<l;j++)
			{
				if(arr[i]==arr2[j])
				{
					break;
				}
			}
			if(j==l)
			{
				arr2[l++]=arr[i];
			}
		}
		
		for(int i=0;i<l;i++)
		{
			arr[i]=arr2[l];
		}
		for(j=0;j<l;j++)
		{
			System.out.println(arr[j]);
		}
	}
}
