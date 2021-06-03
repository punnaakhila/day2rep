package day3;
import java.util.Scanner;

public class Tlab1 {
	public static void main(String[] args){
	int a;
	String f="10";
	//a=Integer.parseInt(args[0]);
	System.out.println("enter");
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	int result=a+Integer.parseInt(f);
	System.out.println("my num:"+a);
	System.out.println(f);
	System.out.println("result:"+result);
	}

}
