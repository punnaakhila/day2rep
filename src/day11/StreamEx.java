package day11;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
    	List<Integer>myList=Arrays.asList(1,5,8,2,3,4,8,13,61);
    	long count=myList.stream().count();
    	System.out.println(count);
        myList.stream().distinct().forEach(System.out::println); 	
        Optional<Integer>val=myList.stream().max(Integer::compare);
        System.out.println(val);
        List<Integer>temp=myList.stream().filter((a)->(a>5)).collect(Collectors.toList());
        System.out.println(temp);
        myList.stream().distinct().forEach(System.out::println);
        Optional<Integer> y= myList.stream().reduce((a,b)->(a+b));
        System.out.println(y);
        List<String>strList=Arrays.asList(new String[] {"nut","hi","this","is","someone is there"});
        List<Integer>counts=strList.stream()
        		           .map(str->str.length())
        		           .collect(Collectors.toList());
        System.out.println(counts);
    }
}
