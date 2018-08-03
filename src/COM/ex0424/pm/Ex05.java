package COM.ex0424.pm;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex05 {
	/*
	 * ���ٽ� ����
	 * ���ٽ��� �����δ� �� �ټ����� Java API���� �����Ѵ�.
	 * consumer : �Ű����� �ְ� ���ϰ��� ����.
	 * supplier : �Ű����� ���� ���ϰ��� �ִ�.
	 * function : �Ű����� �ְ� ���ϰ��� �ִ� //�ַ� �Ű����� ���ϰ����� �����Ҷ� ���
	 * Operator : �Ű����� �ְ� ���ϰ��� �ִ�. // �ַ� �Ű����� �����ϰ� ����� ����
	 * Predicate: �Ű����� �ְ� ���ϰ��� ������ Boolean //�Ű����� ������ true/false�� �����ϰ��� �� ��� ���
	 * 
	 * 
	 * �ż��� ����
	 * �޼��� ������ ���ٽĿ��� �޼ҵ带 �����ؼ� �Ű������� ������ ����Ÿ���� �˾Ƴ��� ���ʿ��� �Ű������� Ÿ���� �����ϴ� ���� ����
	 * �޼��� ������ �Ϲ� �޼��� ����, �Ű������� �޼��� ����, ������ ������ �����Ѵ�.
	 * ����: Ŭ����::�޼���
	 */
	
	
	public static void main(String[] args) {
		/*
		 * Function<String, Member> function1 = (s) -> new Member(s);
			Member member1 = function1.apply("abvzd");
		*/
		Function<String, Member> func1 = Member::new;
		Member member1 = func1.apply("asdsd");
		
		BiFunction<String, String, Member> func2 = Member::new;
		Member member2 = func2.apply("���B", "������������");
	}
}
