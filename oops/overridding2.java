package oops;

class parent2 {
	void print_messege()
	{
		System.out.println("Good Morning");
	}
}
public class overridding2 extends parent2 {
	public static void main(String... args)
	{
		parent2 over=new parent2();
		over.print_messege();
	}
	void print_messege()
	{
		System.out.println("Good night");
	}

}