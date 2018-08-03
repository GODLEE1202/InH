package COM.ex0420.pm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collection
 * 데이터들을 저장하는 클래스 들을 표준화시킨 모듈
 * 다수의 데이터를 저장해서 쉽게 처리하는 바업ㅂ을 제공하는 클래스들로 구성
 * JDK1.2때는 제네릭 없이 제공이 되었으나 여러가지 문제로 인해 1.5~1.6때  많은 기능의 추가와 제네릭의 추가가 일어남
 * 이후 현업에서 가장 많이 사용되는 개체로 손꼽히게 됨
 * collection은 3가지 종류가 있는데 list , set, map이 있다.
 * 
 * List
 * 연속된 공간을 가진 콜렉션 객체
 * 순서가 있는 데이터의 집합
 * 데이터의 중복을 허용하고 인덱스를 통한 조회가 가능하다
 * 사용할 수 있는 클래스 :Vector, ArrayList, LinkedList, Stack
 * 모든 리스트 객체들의 부모 인터페이스에는 List가 있다.
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
		
		list.add(2, "f");//해당 지점에 값 갱신
		System.out.println(list);
		
		list.set(3, "g");
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(0); //값 삭제
		System.out.println(list);
		
		Collections.sort(list);//정렬
		System.out.println(list);
		
		Collections.shuffle(list); //재배열
		System.out.println(list);
	
		System.out.println(list.contains("i"));//값의 존재 여부를 판단
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
