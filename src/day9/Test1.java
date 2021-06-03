package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	Set<String>aList= new HashSet<String>();
	aList.add("oh");
	aList.add("11");
	aList.add("ya");
	aList.add("y");
	aList.add("yup");
	
	for(String i:aList) {
		System.out.println("foreach loop"+i);
	}
	Iterator<String>itr=aList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
}
}
