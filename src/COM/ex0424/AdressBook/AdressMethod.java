package COM.ex0424.AdressBook;

import java.util.*;
import java.util.stream.Stream;

public class AdressMethod {
	Scanner scan = new Scanner(System.in);
	List<AdressBook> list = new ArrayList<AdressBook>();
	//Map<PushData,List<AdressBook>> map = new HashMap<PushData, List<AdressBook>>(); 
	
	
	public  void showList() {	//��ü ���� ���� ��� ���
		Stream<AdressBook> str = list.stream();
		if(list.size()==0)System.out.println("������ ����");
		str.forEach(a->System.out.println(a));
		//Set<PushData> set = map.keySet();
		//Iterator<PushData> it = set.iterator();
		//while (it.hasNext()) {
			//map.get(it);
			
		//}
	}
	
	public void addSetter() {
		AdressBook ab = new AdressBook();
	//	PushData pd = new PushData();
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.nextLine();
		System.out.println("��ȭ��ȣ �� �Է����ּ���");
		String num = scan.nextLine();
		System.out.println("�ּҸ� �Է����ּ���");
		String ad = scan.nextLine();
		System.out.println("�̸����� �Է����ּ���");
		String email = scan.nextLine();
	
		ab.setName(name);
		ab.setPhoneNum(num);
//		pd.setPhonNum(num);
		ab.setAddress(ad);
		ab.setEmail(email);
		
		list.add(ab);
		//map.put(new PushData(pd.getPhonNum()),new ArrayList<AdressBook>());
	}
	
	public void modifySetter() {
		
		System.out.println("���° �ּҸ� �����Ͻðڽ��ϱ�?");
		int i = scan.nextInt();

		System.out.println("������ �� ���Ͻðڽ��ϱ�? 1. �̸�   2. ��ȭ��ȣ   3. �ּ�   4. �̸���");
		int j = scan.nextInt();
	
		scan.nextLine();
		String str = "";
		
		switch (j) {
		case 1:
			System.out.println("�̸��� �������ּ���");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 2:
			System.out.println("��ȭ��ȣ�� �������ּ���");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 3:
			System.out.println("�ּ��� �������ּ���");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 4:
			System.out.println("�̸����� �������ּ���");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		};
	}
	public void removeList() {
		showList();
		System.out.println("���° ����Ʈ�� ���� �Ͻðڽ��ϱ�? (1����)");
		int i = scan.nextInt()-1;
		list.remove(i);
	}
}
