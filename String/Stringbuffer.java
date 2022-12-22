package String;
public class Stringbuffer {
	public static void main(String...strings)
	{
		StringBuffer sb=new  StringBuffer("Good Morning");
		System.out.println(sb);
		sb.append(" Thankyou");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb.delete(0, 4));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.insert(2, "Night"));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(2, 4, "ad"));
		
	}
}