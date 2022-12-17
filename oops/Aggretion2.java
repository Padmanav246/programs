package oops;
class Address
{
	String city,state;
	int pin;
	public Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
}
class About
{
	Address ad;
	String name;
	int age;
	public About(Address ad,String name,int age)
	{
		this.ad=ad;
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println(name+"  "+age+"  Address = "+ad.city+"  "+ad.state);
	}
}
public class Aggretion2 {
	public static void main(String...strings)
	{
		Address ad1=new Address("bdk","odisha");
		Address ad2=new Address("bbsr","odisha");
		About a=new About(ad1,"tarun",22);
		About a2=new About(ad2,"rakesh",21);
		a.display();
		a2.display();
	}
}