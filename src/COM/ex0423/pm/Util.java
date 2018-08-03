package COM.ex0423.pm;

public class Util {
	public<T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
}
