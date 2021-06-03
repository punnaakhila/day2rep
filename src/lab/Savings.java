package lab;

 class Savings extends Account {
	final int minBalance=500;
	public Savings(int accNum,double balance,Person accHolder) {
		super(accNum,balance,accHolder);
		
	}
	public void withdraw(double amount) {
		double balance=getBalance();
		double temp=balance-amount;
		if(temp<minBalance)
		{
			System.out.println(accHolder.getName()+"you are reaching min amount"+"if you withdraw:"+amount);
			System.out.println(accHolder.getName()+"can only withdraw:"+(balance-minBalance));
		}
		else {
			balance=balance-amount;
			setBalance(balance);
			System.out.println(accHolder.getName()+"your balance after withdraw:"+getBalance());
		}
		
	}

	

}
