package COM.ex0424.pm;

import java.util.function.IntBinaryOperator;

public class Ex03 {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x,y) -> Calc.sMethod(x, y);
		System.out.println("���1 : " + operator.applyAsInt(1, 2));
		
		operator = Calc ::sMethod;
		System.out.println("���2 : " + operator.applyAsInt(2, 2));
		
		////////////////////////////////////////////////////////////�ν��Ͻ�
		
		
		Calc obj = new Calc();
		operator = obj :: imethod;
		System.out.println("���3 " + operator.applyAsInt(6, 7) );
		
		
		
		
	}
}
