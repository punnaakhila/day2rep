package day7;

public class DemoPerson {
	public static void main(String[] args) {
		Person person = new Person();
		Details d = new Details();
	d.setDetails(person);
		System.out.println(person.getFullName());

	}

}
