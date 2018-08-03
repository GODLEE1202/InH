package COM.ex0426.pm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		Stream<String> str = set.stream();
		
		str.forEach(s->System.out.println(s));
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.keySet().stream();
		map.values().stream();
		
		
		
	}
}
