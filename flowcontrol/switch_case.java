package flowcontrol;
import java.util.Scanner;

public class switch_case {
	public static void main(String...strings)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the date:-");
		int a= sc.nextInt();
		switch(a%7)
		{
		case 0 : System.out.println("wednesday");
		break;
		case 1 : System.out.println("Thursday");
		break;
		case 2 : System.out.println("friday");
		break;
		case 3: System.out.println("suaterday");
		break;
		case 4 : System.out.println("sunday");
		break;
		case 5 : System.out.println("monday");
		break;
		case 6 : System.out.println("Tuesday");
		break;
		}
	}
}