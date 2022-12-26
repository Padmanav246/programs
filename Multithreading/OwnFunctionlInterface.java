package Multithreading;
interface Functional
{
	public void draw(int n);
}
public class OwnFunctionlInterface {
	public static void main(String[] args) {
		int i=14;
		Functional f1=(int j) -> {System.out.println(j*j);};
		f1.draw(15);
	}
	
}
