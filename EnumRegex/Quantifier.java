package EnumRegex;
import java.util.*;
import java.util.regex.Pattern;

public class Quantifier {
	public static void main(String...strings)
	{
		System.out.println(Pattern.matches("[a-n0-9]*", "Aa"));
	}
} 