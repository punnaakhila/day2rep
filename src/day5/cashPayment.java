package day5;

 class cashPayment extends Payment {
	cashPayment(String name,String address){
		super(name,address);
	}
	public void doPayment(double amount) {
		System.out.println("in child class cashPayment with: "+amount);
		printdetails();
	}
	public void display(String msg) {
	System.out.println(msg);	
	}
	
}
