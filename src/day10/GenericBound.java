package day10;

public class GenericBound <T extends Number>{
	T[] numArr;
	GenericBound(T[] numArr){
		this.numArr=numArr;
	}
	public double getAvg() {
		double sum=0.0;
		for(int i=0;i<numArr.length;i++) {
			sum=sum+numArr[i].doubleValue();
		}
		double avg=sum/numArr.length;
		return avg;
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[]  doubleArray= {1.2,3.4,5.6};
	//	Character[] chaArray= {'a','b'};
	//	GenericBound<Integer> a=new GenericBound( chaArray);
		GenericBound<Integer> b=new GenericBound( intArray);
		GenericBound<Double> g=new GenericBound(doubleArray);
		System.out.println(b.getAvg());
		System.out.println(g.getAvg());
	}

}
