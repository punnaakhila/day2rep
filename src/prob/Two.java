package prob;

public class Two {
	public static void main(String[] args) {
		One one1=new One();
		one1.setDblA(2);
		one1.setDblB(7);
		//one1.setDblC(2);
		one1.dblC=2;
		 double addition=one1.calcadd();
		System.out.println("Addition is:"+ addition);
		
		One one2=new One(90.2,20.9,30);
		 double addition2=one2.calcadd();
		System.out.println("Addition2 is:"+ addition2);
		System.out.println();
		
		
	}

}