package lab;

public class Account {
	 long accNum;
	 double balance;
	 Person accHolder;
	public Account(long accNum, double balance,Person accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double depositAmount) {
		balance=balance+depositAmount;
		System.out.println(accHolder.getName()+"  your balance after deposit:"+getBalance());
	}
	public void withdraw(double withdrawAmount) {
		balance=balance-withdrawAmount;
		System.out.println(accHolder.getName()+"  your balance after withdraw:"+getBalance());
			}
	
	
	
	}
















