package COM.ex0425.am;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		List<Adress> list = new ArrayList<Adress>();
		
		Adress ad1 =new Adress();
		ad1.setName("ȫ�浿");
		ad1.setAddress("����� ���α�");
		ad1.setPhoneNum("0101321321");
		ad1.setEmail("qwe@asdasd.com");
		ad1.setAge(28);
		
		list.add(ad1);
		System.out.println(list.size());
		
		Adress ad2 = list.get(0);
		System.out.println(ad2.getName()+"-"+ad2.getPhoneNum()+"-"+ad2.getAddress()+"-"+ad2.getEmail()+"-"+ad2.getAge());
		
		Adress add3 = new Adress("���", "0321321", "����� ������", "123@������������.com", 40);
		list.add(add3);
		
		add3 = list.get(1);
		//System.out.println(add3.toString());
		System.out.println(add3);
	}
}
