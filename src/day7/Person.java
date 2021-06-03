package day7;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private String fullName;
	
	public Person(String firstName,String lastName,String gender) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		// TODO Auto-generated constructor stub
	}
	public Person(){
		this(null,null,null);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFullName() {
		
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//	public String toString() {
//		return "Name:  "+ getFirstName()+"   Gender:  "+getGender()+"   last name: "+getLastName()+"  Full name:  "+getFullName();
//	}
	

}
