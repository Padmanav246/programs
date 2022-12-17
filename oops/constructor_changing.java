package oops;

public class constructor_changing {
	private int id;
	private String name;

	public constructor_changing() {
		this(999, "john");
		System.out.println("Employee is created wit default name and id");
	}

	public constructor_changing(int id) {
		this(id, "jhon");

		System.out.println("Employee is crested with default name");

	}

	public constructor_changing(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Employee is created");
	}

	public String toString() {
		return "ID = " + id + ",     NAME = " + name;
	}

	public static void main(String... strings) {

		constructor_changing emp = new constructor_changing();
		System.out.println(emp);
		constructor_changing ch1 = new constructor_changing(2);
		System.out.println(ch1);

		constructor_changing ch2 = new constructor_changing(10, "hello");
		System.out.println(ch2);
	}
}