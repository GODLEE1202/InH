package COM.ex0420.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03_CollectionSet {
	/*
	 * Set
	 * 순서가 없는 데이터의 집합
	 * 오로지 노드에만 존재한다.
	 * 데이터의 중복을 허용하지 않는다
	 * 자식클래스 : HashSet, TreeSet
	 */
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(7);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(1);
		System.out.println(set);
		
		set.add(4);
		System.out.println(set.add(4));
		System.out.println(set.add(8));
		System.out.println(set.add(1));
		set.add(6);
		System.out.println(set);
	
		//Iterator it = new Iterator<E>();//에러
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		set.remove(1);
		System.out.println(set);
		
		
	}
}
