package Multithreading;
import java.util.*;
public class Lambda1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.forEach((n) -> {System.out.println(n);});
	}
}
