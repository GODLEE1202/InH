package COM.ex0425.am;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Adress> list = Arrays.asList(
				new Adress ("���", "01055435252", "����� ������", "123@������������.com", 40),
				new Adress("������", "01053215242", "����� ���α�", "����������@������������.com", 27),
				new Adress("������", "01011111111", "����� ��õ��", "3213fd@asd.com", 28)
				);
	
		System.out.println("���° �ּҸ� �����Ͻðڽ��ϱ�?");
		int i = scan.nextInt();
		//Adress addr = list.get(i);

		System.out.println("������ �� ���Ͻðڽ��ϱ�? 1. �̸�   2. ��ȭ��ȣ   3. �ּ�   4. �̸���   5. ����");
		int j = scan.nextInt();
		
		scan.nextLine();
		
		String str = "";
		
		switch (j) {
		case 1:
			System.out.println("�̸��� �������ּ���");
			str = scan.nextLine();
			//addr.setName(str);	//addr ���������� �����ϰ� list.get(i)�� ��ü �ؼ� .setName(str)�� �ִ´�.
			list.get(i).setName(str);
			break;
		case 2:
			System.out.println("��ȭ��ȣ�� �������ּ���");
			str = scan.nextLine();
			//addr.setPhoneNum(str);
			list.get(i).setName(str);
			break;
		case 3:
			System.out.println("�ּ��� �������ּ���");
			str = scan.nextLine();
			//addr.setAddress(str);
			list.get(i).setName(str);
			break;
		case 4:
			System.out.println("�̸����� �������ּ���");
			str = scan.nextLine();
			//addr.setEmail(str);
			list.get(i).setName(str);
			break;
		case 5:
			System.out.println("������ �������ּ���");
			int x = scan.nextInt();
			//addr.setAge(x);
			list.get(i).setName(str);
			break;
		};
		
		//list.set(i, addr); �ּҿ� ���� ������ ���� addr�� ���� �����ϸ� list�� ���� ���ϴϱ� list.set(i,addr)�� �����ص� �������. 
		for(Adress adress :list) {
			System.out.println(adress);
		}
	}
}
