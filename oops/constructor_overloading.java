package oops;

public class constructor_overloading {
	private String name;
	private int id;

	public constructor_overloading() {
		this.name = "Default Name";
	}
	
	public constructor_overloading(String n) {
		this.name = n;
	}
	public constructor_overloading(String n ,int a)
	{
		this.name=n;
		this.id=a;
	}
	public String toString() {
		return "ID="+id+", Name="+name;
	}
	public static void main(String[] args) {
		constructor_overloading d = new constructor_overloading();
		System.out.println(d);
		
		d = new constructor_overloading("Java");
		System.out.println(d);
		
		d = new constructor_overloading("Pankaj", 25);
		System.out.println(d);
	}
}