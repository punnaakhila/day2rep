package day6;

public class InvalidvalueException extends Exception {
	public InvalidvalueException(){
		super();
	}
	public InvalidvalueException(String s){
		super(s);
	}
	public String getMessage() {
		//return "invalid number please enter correct number";
		return super.getMessage();
	}
}
