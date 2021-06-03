package prob;
import java.util.Scanner;
public class fib {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
		  System.out.println("enter a number");
		  int n=scan.nextInt(); 
		  int a=1;
		  int b=1;
		  int c;
		  System.out.print(a+" ");
		  System.out.print(b+" ");
		  for(int i=0;i<n-2;i++) {
			  c=a+b;
			  System.out.print(c+" ");
			  a=b;
			  b=c;
			 // System.out.print(c+" ");
		  }
		  
	   
   }
}
