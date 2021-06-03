package lab;

 class CurrentAccount extends Account{
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	final int overdraftlimit=1000;
	
	public void withdraw(double amount) {
		double balance=getBalance();
		double temp=balance-amount;
		if(temp<overdraftlimit) {
			System.out.println(accHolder.getName()+"you are reaching overdraft limit -1000");
			System.out.println(accHolder.getName()+"you can only with draw this amount"+(balance+1000));
		}
		else {
			balance=balance-amount;
			setBalance(balance);
			System.out.println(accHolder.getName()+"here is your balance after withdraw"+getBalance());
		}
	}
	

}
