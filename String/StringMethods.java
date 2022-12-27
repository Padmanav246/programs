package String;

public class StringMethods {
	public static void main(String...strings)
	{
		String s1="Padmanav Tripathy";
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
//		static String.format("name is %s",s1);
//		System.out.println(s1.format("name is %s",));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,12));
		System.out.println(s1.join("hii", "strings"));
		System.out.println(s1.replace("a", "e"));
		System.out.println(s1.concat(s1));
		System.out.println(s1.equals(s1));
		System.out.println(s1.isEmpty());
		System.out.println(s1.getClass());
		System.out.println(s1.equals(s1));
	}
}
