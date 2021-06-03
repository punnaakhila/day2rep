
package day10;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int age;
	private String name;
	private List<Address> address;
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Address a=new Address();
		List<Address>addresslist=new ArrayList<Address>();
		a.setAddress1("karmanghat");
		a.setAddress2("sanath nagar");
		a.setCity("hyd");
		a.setState("telangana");
		addresslist.add(a);
	    a=new Address();
	    a.setAddress1("ghat");
		a.setAddress2("some nagar");
		a.setCity("some ");
		a.setState("some state");
	    addresslist.add(a);
	    Person person=new Person();
	    person.setName("amm");
	    person.setAddress(addresslist);
	    person.setAge(24);
	    displayperson(person);
	}
	static void displayperson(Person person) {
		System.out.println("name   "+person.getName());
		System.out.println("age   "+person.getAge());
		List<Address>addresslist=person.getAddress();
		for(Address address:addresslist) {
//			System.out.println("add1  "+address.getAddress1());
//			System.out.println("add1  "+address.getAddress2());
//			System.out.println("city   "+address.getCity());
//			System.out.println("state  "+address.getState());
			System.out.println(address);
		}
	}
	

}
