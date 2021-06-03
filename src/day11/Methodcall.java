package day11;
import java.util.function.*;
import java.util.Arrays;

public class Methodcall {
	public static void main(String[] args) {
		doSort s= new doSort();
		String[] strNames=new String[] {"that","is","not","me"};
		s.sortName(strNames);
		Function<String[],String[]>refobj=s::sortName;
		String[] sortNames=refobj.apply(strNames);
		for(String i : sortNames){
		
			System.out.println(i);
		}
		
	}

}
class doSort{
	String[] sortName(String[] names) {
		Arrays.sort(names);
		return names;
		
	}
}