package day4;

public class Child1 extends Parent {
	private int j;
	Child1(int i,int j){
		super(i);
		this.j=j;
	}
	public void display() {
		super.display();
		System.out.println("in child class1");
		System.out.println("value of j:"+j);
	}
//	public Integer getNumber(int num) {
//		return num;
//	}

}
