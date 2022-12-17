abstract class Vehicle
{
	public int no_wheals;
	final String runs_on="oil";
	abstract void show_details();
	public void parent()
	{
		System.out.println("This is comes under vehicle");
	}
}
class bike extends Vehicle
{
	int no_wheals=2;
	int carry_passenger=2;
	int max_spead=120;
	
	void show_details()
	{
		System.out.println("This is comes under two whealers or bike");
		System.out.println("It runs on ="+runs_on);
		System.out.println("It has NUmber of wheals ="+no_wheals);
		System.out.println("It can carry upto number of passengers ="+carry_passenger);
		System.out.println("It has maximum spead ="+max_spead);
	}
}
class car extends Vehicle
{
	int no_wheals=4;
	int carry_passenger=4;
	int max_spead=220;
	
	void show_details()
	{
		System.out.println("This is comes under four whealers");
		System.out.println("It runs on ="+runs_on);
		System.out.println("It has NUmber of wheals ="+no_wheals);
		System.out.println("It can carry upto number of passengers ="+carry_passenger);
		System.out.println("It has maximum spead ="+max_spead);
	}
}
public class Task {
	public static void main(String...strings)
	{
		car varna=new car();
		varna.show_details();
//		bike honda=new bike();
//		honda.show_details();	
	}
}
