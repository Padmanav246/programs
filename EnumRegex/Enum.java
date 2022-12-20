package EnumRegex;

enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SUTERDAY;
	
	public String colorinfo()
	{
		System.out.println("Universal color"+this.toString());
		return this.toString();
	}
}
public class Enum {
	public static void main(String...strings)
	{
		Day d1=Day.FRIDAY;
		String str=d1.colorinfo();
		System.out.println(str);
		Day[] day=Day.values();
		for(Day d:day)
		{
			System.out.println(d+"-------------->"+d.ordinal());
		}
	}
}