package COM.ex0426.pm;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
	/*
	 * �������� �ݷ����� �������� ó���� ���� iterator �� ����߾�߸� �ߴ�.
	 * ������ Stream�̶� java8���� �����ϴ� Ŭ������ �����鼭 ���ٽ����� ���ó�� �ڵ带 ������ �� �ְ� �Ǿ���.
	 * ���� ���� �����ڸ� ��������� ����ó���� �ſ� �������ٴ� ������ �ִ�.
	 * Stream�� ������� �ɼǿ� ���� �߰�ó�� Ȥ�� ����ó���� �����ϴ�.
	 * 
	 */
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("rkrkrkk", 10),
				new Student("asda", 20),
				new Student("�̹̹̹�", 30));

		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("������� : "+ avg);

		
	}
}
