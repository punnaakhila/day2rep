package day5;

public abstract class Payment {
	private String name;
	private String address;
	public Payment() {
		
	}
   public Payment(String name,String address) {
	   this.name=name;
	   this.address=address;
   }
   public void printdetails() {
	   System.out.println("name: "+name +"address: "+ address);
   }
   abstract void doPayment(double amount);
}
