package day12;

 class EThread extends Thread{
	public void run() {
		System.out.println("In ....EeeeThread  "+Thread.currentThread().getName());
	}

}
 class HThread extends Thread{
	 public void run() {
			System.out.println("In ....HhhhhThread  "+Thread.currentThread().getName());
		}

 }
class yThread{
	public static void main(String[] args) {
		new EThread().start();
		new EThread().start();
		new HThread().start();
	}
}