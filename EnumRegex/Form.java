package EnumRegex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Form {
	Scanner sc=new Scanner(System.in);
	public String name()
	{
		System.out.println("Enter Your Name :- ");
		String str=sc.nextLine();
//		Pattern p=Pattern.compile();
//		Matcher m=p.matcher("str");
		if(str.matches("[A-Za-z]+"))
		{
			return str;
		}
		else
		{
			System.err.println("Wrong input try again ---! .");
			name();
		}
		return "default";
	}
	public static void main(String...strings)
	{
		Form f=new Form();
		String Name=f.name();
		System.out.println("Your Name is :-"+Name);
	}
}
