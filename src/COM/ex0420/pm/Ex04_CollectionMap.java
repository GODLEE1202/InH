package COM.ex0420.pm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04_CollectionMap {

	/*
	 * map
	 * 키와 값의 쌍으로 이루어진 콜렉션
	 * 키와 값은 전부 참조형으로 선언이 가능하다
	 * 키는 중복이 허용안되며 값은 중복이 허용된다
	 * 만약 같은 키로 다른값을 선언할 경우 해당 키의 이전의 값은 소멸한다
	 * map을 순차적으로 출력하기 위해서는 set -> iterator로의 변환이 필요하다
	 * 
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(2, "짜장면");
		map.put(1, "짬뽕");
		map.put(3, "갈비탕");
		map.put(9, "팔보채");
		map.put(5, "삼겹살");
		System.out.println(map);
		
		System.out.println("asdasd"+map.keySet());
		
		map.put(6, "짜장면");
		System.out.println(map);
		map.put(3, "탕수육");
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
