package flowcontrol;
import java.util.Random;

public class for_statements {
	public static void main(String...strings)
	{
		Random r=new Random();
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			int a= r.nextInt();
			arr[i]=a;
			sum +=a;
		}
		System.out.println(sum);
		//Enhanced for to iterate
		for(int b:arr)
		{
			System.out.println(b);
		}
	}
}
