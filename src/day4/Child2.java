package day4;

public class Child2 extends Parent {
	private int k;

	Child2(int i, int k) {
		super(i);
		this.k = k;
	}

	public void display() {
		//System.out.println("in child2");
		super.display();
		System.out.println("in child2");
		System.out.println("value of k:" + k);
	}

//	public Number getNumber(int num) {
//		return num;
//	}

}
