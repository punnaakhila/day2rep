package day10;

import java.util.Set;
import java.util.TreeMap;

import java.util.*;

public class KeyValue{
	//private static final String Values = null;

//	public static void main(String[] args) {
//		Map<String,Integer>hmap= new TreeMap<String,Integer>();
//		hmap.put("delhi",42);
//		hmap.put("bangalore",23);
//		hmap.put("delhi",42);
//		System.out.println("     temp in bangalore   "+hmap.get("bangalore"));
//		Set<String>keys=hmap.keySet();
//		for(String s:keys) {
//			System.out.println("  key in hashmap  "+s+"    value   "+hmap.get(s));
//		}
//		Iterable<Integer> Values=hmap.values();
//		for(Integer s:Values) {
//			System.out.println(s);
//			
//		}
//	}
//
//}
	
		static void printArray(int intArr[]) {
		for (int arrayindex : intArr )
		System.out.println(arrayindex);
		}
		static void printCollection(ArrayList arrList) {
		for (Object object : arrList)
		System.out.println(object);
		}
		public static void main(String arg[]) {
		int intArr[] = { 1, 2, 3, 4, 5 };
		printArray(intArr);
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(20);
		printCollection(arraylist);
		}
		}

