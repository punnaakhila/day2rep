package prob;

public class One {
	private double dblA;
	private double dblB;
	public double dblC;
	public One(double dblA,double dblB,double dblC) {
		this.dblA=dblA;
		this.dblB=dblB;
		this.dblC=dblC;
    }
	
	public One() {
		this(4,3,9);
    }
    double calcadd() {
		return dblA + dblB + dblC;
	}
	public double getDblA() {
		return dblA;
	}
	public void setDblA(double dblA) {
		this.dblA = dblA;
	}
	public double getDblB() {
		return dblB;
	}
	public void setDblB(double dblB) {
		if (dblB>5)
		   System.out.println("wrong b value");
		this.dblB = dblB;
	}
	public double getDblC() {
		return dblC;
	}
	public void setDblC(double dblC) {
		this.dblC = dblC;
	}
	
	

}
