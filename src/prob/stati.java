package prob;

public class stati {
	int var_instance;
	static int var_static;
	static {
		 System.out.println(" In");
		   
		var_static=19;
	}
   public static void main(String[] args) {
	   stati obj1=new stati();
	   obj1.var_instance=4;
	   stati.var_static=7;
	   stati obj2=new stati();
	   obj2.var_instance=5;
	   stati.var_static=8;
	   System.out.println(" Instance variable in obj1..."+obj1.var_instance);
	   System.out.println(" Instance variable in obj2..."+obj2.var_instance);
	   
	   System.out.println(" Instance variable in obj1..."+obj1.var_static);
	   System.out.println(" Instance variable in obj2..."+stati.var_static);
	   
   }
}
