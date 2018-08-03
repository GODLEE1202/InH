package COM.ex0426.pm;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex06 {
	public static void main(String[] args) {
		
		String[] strArr = {"aaa","bbb","ccc"};
		
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(a-> System.out.println(a + ","));
		
		int[] intArr = {1,2,3,4,5,65,6,7,7};
		IntStream iStream = Arrays.stream(intArr);
		
		iStream.forEach(a->System.out.print(a+","));
	}
}
