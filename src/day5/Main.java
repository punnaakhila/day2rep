package day5;

public class Main {
 public static void main(String[] args) {
	 Payment payment;
	 payment = new cashPayment("its me...","hyd");
	 payment.doPayment(43);
	 ((cashPayment)payment).display("hello");
 }
}
