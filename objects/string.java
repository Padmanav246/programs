package objects;
class Student
{
	String name;
    int rollNo;
 
	public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
 
    @Override
    public String toString() {
        return name + "," + rollNo;
    	}
}

public class string {
	public static void main(String...strings)
	{
    Student s1=new Student("john",23);
    Student s2=new Student("Ruex",22);
    System.out.println(s1);
    System.out.println(s2);
	}
}
