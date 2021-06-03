package prob;
import java.util.Scanner;
public class traffic {
   public static void main(String[] args) {
	  Scanner opt=new Scanner(System.in);
	  System.out.println("1.red\n 2.green\n 3.yellow");
	  System.out.println("enter");
	  String option=opt.nextLine();
	  switch(option) {
	  case "red" :System.out.println("stop");
	  break;
	  case "green":System.out.println("go");
	  break;
	  case "yellow":System.out.println("be ready");
	  break;
	  default:System.out.println("invalid");
	  break;
	  }
	  
   }
}
