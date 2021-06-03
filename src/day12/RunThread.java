package day12;

class ThreadRun implements Runnable{

	@Override
	public void run() {
		System.out.println("In run method   "+Thread.currentThread().getName());
		
	}
	
}
public class RunThread {
public static void main(String[] args) {
	Thread t=new Thread(new ThreadRun());
	t.start();
	//t.start();
	Thread t1=new Thread(new ThreadRun());
	t1.start();
	Thread t2=new Thread(new ThreadRun(),"some thread");
	t2.setPriority(8);
	t2.start();
}
}
