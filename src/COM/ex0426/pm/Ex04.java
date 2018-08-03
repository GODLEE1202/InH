package COM.ex0426.pm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è¿¬¾Æ","±è»ñ°«","Á¶Çö¾Æ","Á¶Çö¹Î","±è°³¶Ë");
		
		//¼øÂ÷Ã³¸®
		Stream<String> stream = list.stream();
		stream.forEach(Ex04::print);
		
		System.out.println();
		//º´·ÄÃ³¸®
		Stream<String> pStream = list.parallelStream();
		pStream.forEach(Ex04::print);
	}
	public static void print(String str) {
		System.out.println(str+":"+Thread.currentThread().getName());
	
	}
	
}
