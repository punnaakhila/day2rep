package day4;

public class Parent {
	private int i;
	Parent(int i){
		this.i=i;
	}
public void display() {
	System.out.println("in parent class display");
	System.out.println("value of i:"+i);
}
//public Number getNumber(int num) {
//	return num;
//}
}
