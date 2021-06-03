package day3;

public class ArrS {
	private int studid;
	private String name;
	private int age;
	ArrS(int studid,String name,int age){
		this.studid=studid;
		this.name=name;
		this.age=age;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
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
	public String toString() {
		
		return "name:-"+getName() + "     age :-"+getAge();
		
	}
	

}
