package day3;

enum months{
	jan(31),feb(28),march(31);
	public int days;
	months(int days){
		this.days=days;
		}
	/*private int days;
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}*/
	
}

public class Tenum {
	public static void main(String[] args) {
		System.out.println("no of days in feb:"+months.feb.days);
		
	}
 
}
