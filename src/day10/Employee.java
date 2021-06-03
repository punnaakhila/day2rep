package day10;
import java.util.*;
public class Employee implements Comparable<Employee>{
	private String lastName;
	private String firstName;
	private String empId;
	private int age;
	Employee(String lastName, String firstName,String empId,int age){
		this.firstName=firstName;
		this.lastName=lastName;
		this.empId=empId;
		this.age=age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return getFirstName()+"   "+getLastName()+"    "+ getEmpId()+"     "+getAge();
	}
	public int compareTo(Employee o) {
		return this.getFirstName().compareTo(o.getFirstName());
	}
	public static void main(String[] args) {
		List<Employee>emplist=new ArrayList<Employee>();
		Employee emp=new Employee("sita","shukla","e1",23);
		emplist.add(emp);
		 emp=new Employee("gita","harsi","e2",24);
		 emplist.add(emp);
		 emp=new Employee("rita","palsa","e3",63);
		 emplist.add(emp);
		 for(Employee e:emplist) {
			 System.out.println("  "+e);
		 }
		 System.out.println("after by First name");
		 Collections.sort(emplist);
		 for(Employee e:emplist) {
			 System.out.println("  "+e);
		 }
		 Collections.sort(emplist, new MyComparator());
		 for(Employee e:emplist) {
			 System.out.println("  "+e);
		 }
		
		}   
}
class MyComparator implements Comparator<Employee>{
	 @Override
	 public int compare(Employee o1,Employee o2) {
		 return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
	 }
	 
}
