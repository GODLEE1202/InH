package COM.ex0417.pm;

import java.util.Date;


//Ŭ���� : ��ü�� �����ϱ� ���� Ʋ / Ŭ������ü�� ��ü�� �ɼ� ����.
//Ŭ�������� ������ ��ü�� �̸��� '�ν��Ͻ�'��� �θ���.
public class clock {
	
	// �ʵ� /�������
	// ��ü�� �Ӽ��� ��Ÿ���� ����
	// Ŭ���� ������ ������ �����Ͽ� �ش� ��ü�� �Ӽ��� ������ �� �ִ�.
	int battery = 100;
	String shape = "����";
	String band = "����";
	
	//�޼���
	//��ü�� ����� ��Ÿ���� ����
	//Ŭ���� ������ ������ �޼��� ���� �ش� ��ü�� ������ν� Ȱ��ȴ�.
	public void checkTime() {
		Date date = new Date();
		
		System.out.println(shape +"�� " + band +"���� �� �ð��");
		System.out.println("���� �ð��� Ȯ���մϴ�.");
		System.out.println(date);
		battery--;
	}
	public void setTimer() {
		System.out.println("Ÿ�� ��ŸƮ");
		battery--;
	}
	public void lightOn() {
		System.out.println("���� �մϴ�");
		battery--;
	}
}
