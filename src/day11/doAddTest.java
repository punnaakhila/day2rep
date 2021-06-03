package day11;

public class doAddTest {
    public static void main(String[] args) {
    	doAdd d1=(int a,int b)->a+b;
   	System.out.println(d1.adds(5, 100));
        doSub d2=(int a,int b)->{
        	if(a>b)
        	return a-b;
        	else
            return b-a;
        };
    	System.out.println(d2.subs(5, 100));
    }
}
