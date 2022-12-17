package flowcontrol;

public class String_Builer {
	public static void main(String...strings)
	{
		StringBuilder Builder=new StringBuilder();
		Builder.append("java");
		Builder.append("python");
		System.out.println(Builder);
		Builder.delete(3, 5);
		System.out.println(Builder);
		
	}
}