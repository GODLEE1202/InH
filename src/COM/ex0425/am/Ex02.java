package COM.ex0425.am;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		//List<Adress> list = new ArrayList<Adress>();
		
		/*Adress ad1 = new Adress(name, phoneNum, address, email, age);
		list.add(ad1);	//(��)���	���� ����
		*/
		/*
		list.add(new Adress("���", "01055435252", "����� ������", "123@������������.com", 40));
		list.add(new Adress("������", "01053215242", "����� ���α�", "����������@������������.com", 27));
		list.add(new Adress("������", "01011111111", "����� ��õ��", "3213fd@asd.com", 28));
	*/
		
		List<Adress> list = Arrays.asList(
				new Adress ("���", "01055435252", "����� ������", "123@������������.com", 40),
				new Adress("������", "01053215242", "����� ���α�", "����������@������������.com", 27),
				new Adress("������", "01011111111", "����� ��õ��", "3213fd@asd.com", 28)
				);
		/*for (int i = 0; i < list.size(); i++) {
			Adress add = list.get(i);
			//System.out.println(add.toString());
			System.out.println(add); �����ٿ��� .toString���� ����
			(��)���  
			
			System.out.println(list.get(i)); 	//������ ���� ��
		}*/
		for(Adress adress : list) {
			System.out.println(adress);
			//Adress�� list ������ �ݺ���
		}
	
	}
}
