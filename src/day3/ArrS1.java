package day3;

public class ArrS1 {
	public static void main(String[] args) {
		ArrS[] studArr=new ArrS[2];
		ArrS student=new ArrS(1,"ashu",24);
		studArr[0]=student;
		student=new ArrS(3,"jk",23);
		studArr[1]=student;
		for(ArrS s:studArr) {
			System.out.println("name:" + s.getName() + "   age:" + s.getAge()+"  studid"+s. getStudid());
			System.out.println(s);
		}
		
		
	}
 
}
