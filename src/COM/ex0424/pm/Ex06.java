package COM.ex0424.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		/*
		 * Bean��ü 
		 * �����͸� ��ų� ���� �����͸� �����ϴ� �뵵�θ� ���̴� ��ü
		 * ������ ������ �̵��� �������� ���̳� �ٸ� ���ø����̼ǿ��� ���� ���Ǵ� ��ü�̴�.
		 * ��뿹) �Խ���, ȸ������ ��
		 * Bean��ü�� private�� ���������ڰ� �Ǿ��ִ� �ʵ�� getter setter �޼��� ��� �����Ǿ��ִ�. (��Ʈ+����Ʈ+S)
		 * �����͸� ��ų� �����͸� ������ �� �������� ���Ἲ�� ���谡 �ȴ� �Ǵܵ� ���
		 * �߰��� ���� Ȥ�� �˻縦 �ϴ� ������ �ۼ��Ͽ� �������� �������� ���� �� �ִ�.
		 */
		
		
		
/*		Bean bean = new Bean();
		bean.address = "����� ���α�";
		bean.name = "ȫ�浿";
		//��������� ���� �����ҽ� ���Ȼ� ���� ����
*/	
		Scanner scan = new Scanner(System.in);
		Bean bean = new Bean();
		bean.setAddress("����� ���α�");
		bean.setAddress(scan.nextLine());
		bean.setName("ȫ�浿");
		System.out.println(bean.getAddress());
	
	}

}
