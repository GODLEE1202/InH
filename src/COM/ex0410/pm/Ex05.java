package COM.ex0410.pm;

public class Ex05 {

	public static void main(String[] args) {
		//�� ������ 
		/*
		 * �캯�� ������ ������� �ʴ� ���� 
		 * && ���� ������� �����̸� �캯�� ������ �������� �ʴ´�.
		 * || ���� ������� ���̸� �캯�� ������ �������� �ʴ´�.
		 * 
		 */
		int x = 3;
		int y = 5;
		
		System.out.println(((x+=2)>4) && ((y-=3)<3));
		System.out.println(x);
		System.out.println(y);
		
		int x1 =3;
		int y1 = 5;
		System.out.println((x1+=2)<4 && (y1-=3)<3);
		System.out.println(x1);
		System.out.println(y1);
		

		int x2 = 3;
		int y2 = 5;
		System.out.println((x2+=2)>4 ||(y2-=3)<3);
		System.out.println(x2);
		System.out.println(y2);

	}

}
