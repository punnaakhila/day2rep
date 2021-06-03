package day11;
import java.util.function.*;
public class Predict {
public static void main(String[] args) {
	Predicate<Integer>obj;
	obj=n->(n%2)==0;
	System.out.println("is number even:"+obj.test(9));
}

}
