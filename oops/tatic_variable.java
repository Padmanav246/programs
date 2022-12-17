package oops;

public class tatic_variable {
	static String College="same";
	private String name;
	public static void main(String...strings)
	{
		tatic_variable t=new tatic_variable();
		t.name="Rohn";
		tatic_variable t2=new tatic_variable();
		t2.name="Rakul";
		System.out.println(t.College);
		System.out.println(t2.College);
	}
}
