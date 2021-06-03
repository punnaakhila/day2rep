package day12;
class InCount implements Runnable{
	RaceCondition rc;
	public InCount(RaceCondition rc) {
		this.rc=rc;
	}
	public void run() {
		rc.incrementCounter();
		//System.out.println("value:"+Thread.currentThread().getName()+"   "+rc.getCounter());
	}
}

public class RaceCondition {
    int counter=0;
    public void incrementCounter() {
    	counter++;
    	//System.out.println("value:"+Thread.currentThread().getName());
		
	}
    public int getCounter() {
    	return counter;
    }
	public static void main(String[] args) {
    	RaceCondition rc=new RaceCondition();
    	for(int i=0;i<10;i++) {
    	new Thread(new InCount(rc)).start();
    	}
    }
}
