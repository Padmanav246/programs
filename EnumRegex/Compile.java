package EnumRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compile {
	public static void main(String...strings)
	{
		String actual="abcpi";
		Pattern pt=Pattern.compile("[a-z]");
		Matcher mt=pt.matcher(actual);
		
		System.out.println(mt.matches());
	}
}
