package oops;

class Employee
{
	String name;
	int empid;
	public Employee(String name,int empid)
	{
		this.name=name;
		this.empid=empid;
	}
}
public class constructor {
	public static void main(String...strings)
	{
		Employee e1=new Employee("John",102);
		Employee e2=new Employee("Reha",111);
		System.out.println(e1.name);
	}
}
