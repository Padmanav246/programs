package oops;

class location
{
	public String loc="Hydrabad";	
}
class analyst extends location
{
	public String prof="Analysis";
}
class desighn extends location
{
	public String prof="Desighn"; 
}
public class hierarchical {
	public static void main(String...strings)
	{
		desighn d1=new desighn();
		System.out.println(d1.loc+"  ,  "+d1.prof);
		analyst a1=new analyst();
		System.out.println(a1.loc+"  ,  "+a1.prof);
		
	}

}
