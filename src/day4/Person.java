package day4;

class InforPerson {
	private String name;
	private int age;

	InforPerson(String name, int age) {
		System.out.println("person class constructor");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void displayName() {
		System.out.println("name of the person " + getName());
	}

	void displayage() {
		System.out.println("age of the person is :" + getAge());
	}
}

public class Person extends InforPerson {
	int phone;

	Person(String name, int age, int phone) {
		super(name, age);
		System.out.println("child class constructor");
		this.phone = phone;
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayName() {
		super.displayName();
		System.out.println("Phone " + phone);
	}

	public static void main(String[] agrs) {
		Person p = new Person("Abc", 23, 673849383);
		p.displayName();
		p.displayage();
	}
}