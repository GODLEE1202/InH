package COM.ex0417.pm;

public class ex01 {

	public static void main(String[] args) {
		
		//�ν��Ͻ� ������
		// �ν��Ͻ��� �ڹٿ��� ������ ��ü�� �θ��� �̸�
		//���� : Ŭ������ �̸�(�����̸�) = new �����ڸ޼���();
		clock ck1 = new clock();
		
		//�ν��Ͻ� �ʵ� ���� ���
		// ���� : �ν��Ͻ���.�ʵ��
		System.out.println(ck1.battery);
		System.out.println(ck1.band);
		System.out.println(ck1.shape);
		
		ck1.shape = "�׸� ���";
		System.out.println(ck1.shape);
		
		//�ν��Ͻ� �޼��� ���ٹ��
		//���� : �ν��Ͻ���.�޼�����(���ڰ�)
		ck1.checkTime();
		ck1.lightOn();
		ck1.setTimer();
		System.out.println(ck1.battery);
		
		
	}

}
