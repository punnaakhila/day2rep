package day5;


	public class Interfaceprg implements MyInterface {

		@Override
		public int method1() {
			System.out.println("in method one");
			System.out.println("value of i "+i);
			return i;
		}

		@Override
		public void method2() {
			
			System.out.println(" i'm in method 2");
		}
	    public void method3() {
			
			System.out.println("i'm in method 3");
		}
		public static void main(String[] args) {
			MyInterface i;
	       i= new Interfaceprg();
	      // Interfaceprg inter = new Interfaceprg();
	       int a = i.method1();
	       System.out.println(a);
	       i.method2();
	      // inter.method3();
		}

	}


