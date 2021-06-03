package day10;

public class GenericClass<T,k> {
	T obj ;
	k obj2;

	public k getObj2() {
		return obj2;
	}

	public void setObj2(k obj2) {
		this.obj2 = obj2;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}