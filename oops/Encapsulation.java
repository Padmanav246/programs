// If a class follows data hiding and abstraction such type of class is said to be 'Encapsulated' class.
//The Java Bean class is the example of a fully encapsulated class.
//By providing only a setter or getter method, you can make the class read-only or write-only.

package oops;

//using getters to make a class only readable
class readeable{
	private String name="xyz";
	public String getname()
	{
		return name;
	}
}


//using setters to make a class only writable
class Writable{
	private String name;
	public void setname(String name)
	{
		this.name=name;
		//System.out.println(name);
	}
}
public class Encapsulation {
	public static void main(String...strings)
	{
		readeable r=new readeable();
		String str=r.getname();
		
		Writable w=new Writable();
		w.setname("abc");
		System.out.println(str);
	}	
}
