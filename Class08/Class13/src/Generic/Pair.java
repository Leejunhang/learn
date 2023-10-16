package Generic;

public class Pair<T, U> {
	private T i1;
	private U i2;
	
	public Pair(T i1, U i2) {
		this.i1 = i1;
		this.i2 = i2;
	}
	
	public T getI1() {
		return i1;
	}
	
	public U getI2() {
		return i2;
	}
}
