package COM.ex0425.pm;

public class Ex06 {
	//���� ���� ������
	public static void main(String[] args) {
		//int a = 2;
		int a =3;
		try {
			System.out.println("���� 1��");
			System.out.println("���� 2��");
			
			CustomException e = new CustomException();
			
			if(a>2) {
				throw e;
			}
			
			System.out.println("���� 3��");
			System.out.println("���� 4��");
			System.out.println("���� 5��");
		}catch(Exception e){
			System.out.println("Ŀ�����ͼ��� ����");
		}
	}
}
