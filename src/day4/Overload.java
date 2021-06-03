package day4;

public class Overload {
	void method(int i,int j) {
		System.out.println("in integer type:"+i+" and "+j);
	}
	void method(String i,String j) {
		System.out.println("in string type:"+i+" and "+j);
	}
	public static void main(String[] args) {
		Overload obj=new Overload();
		obj.method(2,4);
		obj.method("jjjjj", "kkkkkkk");
	}
	

}
