package prob;


	
	import java.util.*;
	public class sumlab1 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter");
			int n= sc.nextInt();
			
			System.out.println(calculateSum(n));
		}
		public static int calculateSum(int n) {
			int sum = 0;
			for(int i=1; i<=n; i++) {
				if(i%3 == 0 || i%5==0) {
					sum+=i;
				}
			}return sum;
		}
	}

