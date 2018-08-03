package COM.ex0420.am;

public class Box<T,M> {

	private T t;
	private M m;
	
	public T get() {
		return t;
		
	}
	public void set(T t) {
		this.t= t;
	}
	public M getM() {
		return m;
		
	}
	public void  setM(M m) {
		this.m = m;
	}
}
