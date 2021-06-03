package day7;
//import java.util.Scanner;
public class Details {
	public Details() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Person setDetails(Person person) {
		//Scanner scan=new Scanner(System.in);
		person.setFirstName("paul");
		person.setGender("male");
		person.setLastName("smith");
		String m=toCreateFullName(person);
		person.setFullName(m);
		
		return person;
	}
	  public static  String toCreateFullName(Person p){
		  StringBuffer sb = new StringBuffer();
		  if(p.getGender().equals("male"))
			{
				sb.append("mr.");
			}
			else if(p.getGender().equals("female"))
			{
				sb.append("ms.");
			}
			else
			{
				System.out.println("Enter the proper gender");
			}
			sb.append(p.getFirstName());
			sb.append(" ");
			sb.append(p.getLastName());
			return sb.toString();
		 
			  
		  
		   
		
	}
	

}
