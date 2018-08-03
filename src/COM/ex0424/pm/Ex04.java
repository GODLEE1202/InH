package COM.ex0424.pm;

import java.util.function.ToIntBiFunction;

public class Ex04 {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s.compareToIgnoreCase("aBd"));
		ToIntBiFunction<String, String> function;
		function = (a, b)-> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("java10", "java10"));
		
		function = String:: compareToIgnoreCase;
		System.out.println(function.applyAsInt("java10", "java10"));
	}
}
