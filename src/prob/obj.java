package prob;

public class obj {
	int a,b;
	public int add() {
		return a+b;
	}
public static void main(String[] args) {
	obj r=new obj();
	r.a=4;
	r.b=6;
	int c=r.add();
	System.out.println("my ans:"+c);
	
}
}
