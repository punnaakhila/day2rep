package day10;

public class Genericmethod {
	public static void main(String[] args) {
		Genericmethod obj=new Genericmethod();
		Integer[] intArray= {1,3,5,7};
		Double[] doubleArray= {1.3,3.4,5.8};
		Character[] chaArray= {'a','b'};
;		obj.printEle(intArray);
		obj.printEle(doubleArray);
		obj.printEle(chaArray);
	}
	public <T> void printEle(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("."+arr[i]);
		}
	}

}
