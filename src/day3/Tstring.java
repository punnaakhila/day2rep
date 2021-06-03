package day3;
import java.util.Scanner;
public class Tstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter date of birth in the format of dd/mm/yyyy:");
		String date=scan.next();
		int dm,dd,dy;
//		System.out.println(date);
//		System.out.println("month is:"+date.substring(date.indexOf("/")+1,date.lastIndexOf("/")));
//		System.out.println("year is:"+date.substring(date.lastIndexOf("/")+1,date.length()));
		
		dd=Integer.parseInt(date.substring(0,2));
		if(dd <1 || dd>31 )
			throw new IllegalArgumentException ("invalid day");
		
		dm=Integer.parseInt(date.substring(3,5));
		if(dm<1 || dm>12)
			throw new IllegalArgumentException ("invalid month");
			
		dy=Integer.parseInt(date.substring(6,10));
		if(dy<2020)
		    throw new  IllegalArgumentException ("invalid year  ");
		else System.out.println("valid date of birth");

	}

}
