package day10;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericMain {

	public static void main(String[] args) {
		GenericClass<String,Integer> b = new GenericClass<String,Integer>();
		b.setObj("hjhj");
		b.setObj2(2);
		System.out.println(b.getObj()+"...."+b.getObj2());
		GenericClass<Integer,Double> i = new GenericClass<Integer,Double>();
		i.setObj(5);
		i.setObj2(2.54);
		
		System.out.println(i.getObj()+"...."+i.getObj2());
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("one");
		map.add("four");
		Iterator it = map.iterator();
		while (it.hasNext() ) 
		System.out.print( it.next() + " " );
	}

}