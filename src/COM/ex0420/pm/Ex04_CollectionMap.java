package COM.ex0420.pm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04_CollectionMap {

	/*
	 * map
	 * Ű�� ���� ������ �̷���� �ݷ���
	 * Ű�� ���� ���� ���������� ������ �����ϴ�
	 * Ű�� �ߺ��� ���ȵǸ� ���� �ߺ��� ���ȴ�
	 * ���� ���� Ű�� �ٸ����� ������ ��� �ش� Ű�� ������ ���� �Ҹ��Ѵ�
	 * map�� ���������� ����ϱ� ���ؼ��� set -> iterator���� ��ȯ�� �ʿ��ϴ�
	 * 
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(2, "¥���");
		map.put(1, "«��");
		map.put(3, "������");
		map.put(9, "�Ⱥ�ä");
		map.put(5, "����");
		System.out.println(map);
		
		System.out.println("asdasd"+map.keySet());
		
		map.put(6, "¥���");
		System.out.println(map);
		map.put(3, "������");
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.get(1));
	
		map.remove(6);
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		Collection<String> values = map.values();
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
	
	}

}
