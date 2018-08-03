package COM.ex0420.pm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collection
 * �����͵��� �����ϴ� Ŭ���� ���� ǥ��ȭ��Ų ���
 * �ټ��� �����͸� �����ؼ� ���� ó���ϴ� �پ����� �����ϴ� Ŭ������� ����
 * JDK1.2���� ���׸� ���� ������ �Ǿ����� �������� ������ ���� 1.5~1.6��  ���� ����� �߰��� ���׸��� �߰��� �Ͼ
 * ���� �������� ���� ���� ���Ǵ� ��ü�� �ղ����� ��
 * collection�� 3���� ������ �ִµ� list , set, map�� �ִ�.
 * 
 * List
 * ���ӵ� ������ ���� �ݷ��� ��ü
 * ������ �ִ� �������� ����
 * �������� �ߺ��� ����ϰ� �ε����� ���� ��ȸ�� �����ϴ�
 * ����� �� �ִ� Ŭ���� :Vector, ArrayList, LinkedList, Stack
 * ��� ����Ʈ ��ü���� �θ� �������̽����� List�� �ִ�.
 * 
 */

public class Ex02_CollectionList {
	public static void main(String[] args) {
		String[] str = new String[5];
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		
		list.add(2, "f");//�ش� ������ �� ����
		System.out.println(list);
		
		list.set(3, "g");
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(0); //�� ����
		System.out.println(list);
		
		Collections.sort(list);//����
		System.out.println(list);
		
		Collections.shuffle(list); //��迭
		System.out.println(list);
	
		System.out.println(list.contains("i"));//���� ���� ���θ� �Ǵ�
		System.out.println(list.contains("f"));
		
/*		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
*/		
		for (String string : list) {
			System.out.println(string);
			
		}
	}
}
