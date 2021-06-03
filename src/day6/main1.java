package day6;

public class main1 {
	public static void main(String[] args) {
		main1 acc=new main1();
	    int accNo=134;
	    try {
			acc.getDetails(accNo);
		} catch (InvalidvalueException e) {
			// TODO Auto-generated catch block
			System.out.println("i entered catch"+e);
			//e.printStackTrace();
		}
	}
	public static void getDetails(int accNo) throws InvalidvalueException {
		if(accNo==124) {
			System.out.println("account number is correct");
		}
		else {
			//String msg="invalid account number";
			//InvalidvalueException e=new InvalidvalueException(msg);
			//System.out.println(e.getMessage());
			throw new InvalidvalueException("you are entering invalid number");
			
		}
	}
}
