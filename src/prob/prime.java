package prob;
import java.util.Scanner;
public class prime {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	  System.out.println("enter a number");
	  int n=scan.nextInt(); 
	  
	  int count;
	  for(int i=1;i<=n;i++) {
		  count=0;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0 && i!=1) {
			System.out.println(i+"");
		}
		
	  }
	 
 }
}
