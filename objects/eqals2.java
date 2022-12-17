package objects;

class Employe {
	String name;
	String rollNo;
	
	public Employe(String name, String rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public boolean equals(Object obj){
		try
		{
			String name1=this.name;
			String rollNo=this.rollNo;
			Employe e=(Employe)obj;
			String name2=e.name;
			String rollNo2=e.rollNo;
			if(name1.equals(name2) && rollNo.equals(rollNo2) ){
			return true;
			}
			else{
			return false;
			}
		}
		catch(ClassCastException cce)
		{
		return false;
		}
		catch(NullPointerException npe)
		{
		return false;
		}
	}
}
public class eqals2 {
	public static void main(String... strings) {
		Employe e1=new Employe("durga","10");
		Employe e2=new Employe("ashok","20");
		Employe e3=new Employe("ashok","20");
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3)); 
		}
}