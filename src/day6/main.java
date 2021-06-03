package day6;
import java.util.Scanner;
public class main {
	static void agevalidate() throws InvalidvalueException{
	int age;
	Scanner scan=new Scanner(System.in);
	age=scan.nextInt();
	if(age<15) {
		throw new InvalidvalueException("wrong value");
	}
	else {
		System.out.println("correct value");
	}
	}
public static void main(String[] args) {
	try {
		agevalidate();
	}catch(Exception e) {
		System.out.println("exception found  "+e);
	}
	
}
}
