package COM.ex0420.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03_CollectionSet {
	/*
	 * Set
	 * ������ ���� �������� ����
	 * ������ ��忡�� �����Ѵ�.
	 * �������� �ߺ��� ������� �ʴ´�
	 * �ڽ�Ŭ���� : HashSet, TreeSet
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
	
		//Iterator it = new Iterator<E>();//����
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		set.remove(1);
		System.out.println(set);
		
		
	}
}
