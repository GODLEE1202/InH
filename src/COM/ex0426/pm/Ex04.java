package COM.ex0426.pm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�迬��","���","������","������","�谳��");
		
		//����ó��
		Stream<String> stream = list.stream();
		stream.forEach(Ex04::print);
		
		System.out.println();
		//����ó��
		Stream<String> pStream = list.parallelStream();
		pStream.forEach(Ex04::print);
	}
	public static void print(String str) {
		System.out.println(str+":"+Thread.currentThread().getName());
	
	}
	
}
