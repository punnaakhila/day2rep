package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer>aList= new ArrayList<Integer>();
	aList.add(10);
	aList.add(11);
	aList.add(7);
	aList.add(3);
	aList.add(10);
	for(int i=0;i<aList.size();i++) {
		System.out.println("normal for loop"+aList.get(i));
	}
	for(int i:aList) {
		System.out.println("foreach loop"+i);
	}
	Iterator<Integer>itr=aList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
}
}
