package COM.ex0425.pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import COM.ex0425.am.Adress;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	List<Address> list = new ArrayList<Address>(
			/*new Address("������","11111","����","aaaaaa",44),
			new Address("������","22222","���","bbbbbb",37),
			new Address("������","33333","�뱸","cccccc",12),
			new Address("������","44444","�λ�","dddddd",19),
			new Address("������","55555","����","ffffff",20)
			*/
			);
	
	public AddressBook() {
		list.add(new Address("������","11111","����","aaaaaa",44));
		list.add(new Address("������","22222","���","bbbbbb",37));
		list.add(new Address("������","33333","�뱸","cccccc",12));
		list.add(new Address("������","44444","�λ�","dddddd",19));
		list.add(new Address("������","55555","����","ffffff",20));
		
		while(true) {
			if(mainProcess())break;	
		}
	}
	//��ü��ȸ
	public void searchAll() {
		for (Address address : list) {
			System.out.println(address);	
		}
	}
	//�߰�
	public void addAddress() {
		/*
		//1��° 
		Address addr = new Address();
		
		System.out.println("�̸��� �߰����ּ���");
		addr.setName(scan.nextLine());
		System.out.println("��ȭ��ȣ�� �߰����ּ���");
		addr.setPhoneNum(scan.nextLine());
		System.out.println("�ּҸ� �߰����ּ���");
		addr.setAddress(scan.nextLine());
		System.out.println("�̸��ϸ� �߰����ּ���");
		addr.setEmail(scan.nextLine());
		System.out.println("���̸� �߰����ּ���");
		addr.setAge(scan.nextInt());
		
		 /* addr.setName(name);
		addr.setPhoneNum(phone);
		addr.setAddress(address);
		addr.setEmail(email);
		addr.setAge(age);
		
		list.add(addr);*/
		/////////////////////////////////////////////////////////////////////////////
		//2��° ������ ����
		//Address addr = new Address();
		
		System.out.println("�̸��� �߰����ּ���");
		String name = scan.nextLine();
		System.out.println("��ȭ��ȣ�� �߰����ּ���");
		String phone = scan.nextLine();
		System.out.println("�ּҸ� �߰����ּ���");
		String address = scan.nextLine();
		System.out.println("�̸��ϸ� �߰����ּ���");
		String email = scan.nextLine();
		System.out.println("���̸� �߰����ּ���");
		int age = scan.nextInt();
		
//		addr.setName(name);
//		addr.setPhoneNum(phone);
//		addr.setAddress(address);
//		addr.setEmail(email);
//		addr.setAge(age);
//		
		list.add(new Address(name, phone, address, email, age));
		/////////////////////////////////////////////////////////////////////////////
	}
	//����
	public void removeAddress() {
		System.out.println("���°�� ����ðڽ��ϱ�?");
		int i = scan.nextInt();
		list.remove(i);
	}
	
	//����
	public void modifyAddress() {
		
		System.out.println("���° �ּҸ� �����Ͻðڽ��ϱ�?");
		int i = scan.nextInt();
		//Adress addr = list.get(i);

		System.out.println("������ �� ���Ͻðڽ��ϱ�? 1. �̸�   2. ��ȭ��ȣ   3. �ּ�   4. �̸���   5. ����");
		
		
		String str = "";
		
		switch (scan.nextInt()) {
		case 1:
			scan.nextLine();
			System.out.println("�̸��� �������ּ���");
			str = scan.nextLine();
			//addr.setName(str);	//addr ���������� �����ϰ� list.get(i)�� ��ü �ؼ� .setName(str)�� �ִ´�.
			list.get(i).setName(str);
			
			break;
		case 2:
			scan.nextLine();
			System.out.println("��ȭ��ȣ�� �������ּ���");
			str = scan.nextLine();
			//addr.setPhoneNum(str);
			list.get(i).setName(str);
			
			break;
		case 3:
			scan.nextLine();
			System.out.println("�ּ��� �������ּ���");
			str = scan.nextLine();
			//addr.setAddress(str);
			list.get(i).setName(str);
		
			break;
		case 4:
			scan.nextLine();
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
	}
	
	public boolean mainProcess() {
		searchAll();
		System.out.println("1. �߰�  2. ����,  3. ����");
		
		boolean b = false;
		
			switch (scan.nextInt()) {
			case 1:
				scan.nextLine();
				addAddress();
				break;
				
			case 2:
				modifyAddress();
				break;

			case 3:
				removeAddress();
				break;
			}
		
		return true;
	}
}

