package COM.ex0424.pm;

import java.util.function.IntBinaryOperator;

public class Ex01 {
	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		
	/*	//IntBinaryOperator ibo = (a,b) -> {return (a>b)? a:b;};
		IntBinaryOperator ibo = (a,b) -> (a>=b)? a:b;
		System.out.println("최대값 : " + mm.MaxOrMin(ibo)); */
		
		System.out.println("최대값 : " + mm.MaxOrMin((a,b)->(a>=b)?a:b));
		System.out.println("최소값 : " + mm.MaxOrMin((a,b)->(a<=b)?a:b));
	}
}
