package String;
import java.util.*;

public class Tokenizer {
	public static void main(String[] args) {
//		constructor -1
		StringTokenizer st=new StringTokenizer("My name is padmanav tripathy"," ");
		while(st.hasMoreTokens())
		{
//			System.out.println(st.nextToken());
			System.out.println(st.nextElement());
		}
		System.out.println(st.countTokens());
	}
}
