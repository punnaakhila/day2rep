package prob;

public class Account {
	
		
		private long accNum;
		private double balance;
		private String accHolder; 
		
		public Account(long accNum, double balance,String accHolder) {
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}
		
		private void deposite(double amount){
			this.balance = this.balance + amount;
		}
		
		private void withdraw(double amount){
			this.balance = this.balance - amount;
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

		public String getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(String accHolder) {
			this.accHolder = accHolder;
		}



		public static void main(String[] args) {
			Account obj = new Account(1000, 680,"mine");
			double bal = obj.balance;
			//long acc=obj.accNum;
			//System.out.println("inital:"+bal);
			System.out.println("holder:"+obj.accHolder);
			System.out.println("acc no:"+obj.accNum);
			System.out.println("inital:"+bal);
			obj.deposite(1000);
			
			System.out.println( "after deposit:"+ obj.balance);
			
			obj.withdraw(200);
			
			System.out.println( "after withdraw:"+obj.getBalance());
			
		}

	}

