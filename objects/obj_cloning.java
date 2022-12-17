package objects;

public class obj_cloning implements Cloneable{  
	int rollno;  
	String name;  
	  
	obj_cloning(int rollno,String name)
	{  
		this.rollno=rollno;  
		this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  
	  
	public static void main(String args[])
	{  
		try
		{  
			obj_cloning s1=new obj_cloning(111,"pintu");  
		  
			obj_cloning s2=(obj_cloning)s1.clone();  	  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
		}
		catch(CloneNotSupportedException c){
			System.out.println(c);
		}  
	  }  

}
