package EnumRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex1 {
	public static void main(String...strings)
	{
		Scanner sc=new Scanner(System.in);
		String REGEX=".*www.*";
		System.out.println("Enter The web address");
		String actualstring=sc.nextLine();
		Pattern pt=Pattern.compile(REGEX);
		Matcher match=pt.matcher(actualstring);
		boolean matches=match.matches();
		System.out.println("actualString"+"Contains Regex= "+matches);
	}
}
