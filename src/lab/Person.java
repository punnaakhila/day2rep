package lab;

public class Person {
	private String name;
	private int age;

	Person(String name, int age) {
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

}
