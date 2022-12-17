package objects;
class Test
{
	int i;
	public Test(int i) {
	this.i = i;
	}
	@Override
	public int hashCode() {
	return i;
	}
}
public class hashcode {
	public static void main(String[] args) {
		Test t1=new Test (9);
		Test t2=new Test (71);
		System.out.println(t1);
		System.out.println(t2);
		}
}
