package EnumRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String...strings)
	{
		String REGEX=".*www.*";
		String actualstring="www.myweb.com";
		Pattern pt=Pattern.compile(REGEX);
		Matcher match=pt.matcher(actualstring);
		boolean matches=match.matches();
		System.out.println("actualString"+"Contains Regex= "+matches);
	}
}
