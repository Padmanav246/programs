package oops;
class Student
{
	int rollno;
	String name;
	static String clg="same";
	static void change()
	{
		clg="Altered";
	}
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public String toString()
	{
		return  "name = "+name+" ,   Rollno = "+rollno+" ,   College = "+clg;
	}
}
public class static_method {
	int a=12;
	public static void main(String...strings)
	{
		//This is an error as Static method can not call non static  method directly
		//System.out.println(a);
		
		
		Student s1=new Student(11,"Ram");
		Student s2=new Student(12,"har");
		s2.change();
		System.out.println(s1);
		System.out.println(s2);	
	}
}
