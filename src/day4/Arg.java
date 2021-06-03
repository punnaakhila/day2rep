package day4;

public class Arg {
	
	
	    public static void main(String[] args)
	    {
	        int result1 = sum(1, 2);
	        int result2 = sum(1, 2, 3);
	        int result3 = sum(1, 2, 4, 5, 6, 1000);

	        System.out.println(result1 + "\n" + result2 + "\n" + result3);
	    }

	    private static int sum(int... i)
	    {
	        int ret = 0;

	            for (int val : i)
	            {
	                ret += val;
	        }
	        return ret;
	    }
	
}
