package day4;


public class Override {
	public static void main(String[] arg) {
		Child1 child1=new Child1(5,7);
		Child2 op2=new Child2(3,1);
		Parent parent=new Parent(8);
		parent.display();
		parent=child1;
		parent.display();
		parent=op2;
		parent.display();
	}

}
