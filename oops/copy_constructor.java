package oops;
import java.util.ArrayList;
import java.util.List;
class Fruits {

	private List<String> fruitsList;

	public List<String> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(List<String> fruitsList) {
		this.fruitsList = fruitsList;
	}

	public Fruits(List<String> fl) {
		this.fruitsList = fl;
	}
	
	public Fruits(Fruits fr) {
		List<String> fl = new ArrayList<>();
		for (String f : fr.getFruitsList()) {
			fl.add(f);
		}
		this.fruitsList = fl;
	}
}

public class copy_constructor {
	public static void main(String...strings)
	{
		List<String> f1=new ArrayList();
		f1.add("Apple");
		f1.add("Orange");
		
		Fruits fr = new Fruits(f1);

		System.out.println(fr.getFruitsList());

		Fruits frCopy = fr;
		frCopy.getFruitsList().add("Apple");

		System.out.println(fr.getFruitsList());

		frCopy = new Fruits(fr);
		frCopy.getFruitsList().add("Banana");
		System.out.println(fr.getFruitsList());
		System.out.println(frCopy.getFruitsList());

	}	
	}


//class Complex {
//
//	private double re, im;
//
//	public Complex(double re, double im)
//	{
//
//		this.re = re;
//		this.im = im;
//	}
//
//	Complex(Complex c)
//	{
//
//		System.out.println("Copy constructor called");
//
//		re = c.re;
//		im = c.im;
//	}
//	@Override public String toString()
//	{
//
//		return "(" + re + " + " + im + "i)";
//	}
//}
//
//public class copy_constructor {
//	public static void main(String[] args)
//	{
//		Complex c1 = new Complex(10.00, 15.78);
//
//		Complex c2 = new Complex(c1);
//
//		Complex c3 = c2;
//		System.out.println(c2);
//	}
//}
