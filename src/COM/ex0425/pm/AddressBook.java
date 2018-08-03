package COM.ex0425.pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import COM.ex0425.am.Adress;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	List<Address> list = new ArrayList<Address>(
			/*new Address("ㅋㅋㅋ","11111","서울","aaaaaa",44),
			new Address("ㅂㅂㅂ","22222","울산","bbbbbb",37),
			new Address("ㄱㄱㄱ","33333","대구","cccccc",12),
			new Address("ㄴㄴㄴ","44444","부산","dddddd",19),
			new Address("ㄷㄷㄷ","55555","제주","ffffff",20)
			*/
			);
	
	public AddressBook() {
		list.add(new Address("ㅋㅋㅋ","11111","서울","aaaaaa",44));
		list.add(new Address("ㅂㅂㅂ","22222","울산","bbbbbb",37));
		list.add(new Address("ㄱㄱㄱ","33333","대구","cccccc",12));
		list.add(new Address("ㄴㄴㄴ","44444","부산","dddddd",19));
		list.add(new Address("ㄷㄷㄷ","55555","제주","ffffff",20));
		
		while(true) {
			if(mainProcess())break;	
		}
	}
	//전체조회
	public void searchAll() {
		for (Address address : list) {
			System.out.println(address);	
		}
	}
	//추가
	public void addAddress() {
		/*
		//1번째 
		Address addr = new Address();
		
		System.out.println("이름을 추가해주세요");
		addr.setName(scan.nextLine());
		System.out.println("전화번호를 추가해주세요");
		addr.setPhoneNum(scan.nextLine());
		System.out.println("주소를 추가해주세요");
		addr.setAddress(scan.nextLine());
		System.out.println("이메일를 추가해주세요");
		addr.setEmail(scan.nextLine());
		System.out.println("나이를 추가해주세요");
		addr.setAge(scan.nextInt());
		
		 /* addr.setName(name);
		addr.setPhoneNum(phone);
		addr.setAddress(address);
		addr.setEmail(email);
		addr.setAge(age);
		
		list.add(addr);*/
		/////////////////////////////////////////////////////////////////////////////
		//2번째 로직의 선택
		//Address addr = new Address();
		
		System.out.println("이름을 추가해주세요");
		String name = scan.nextLine();
		System.out.println("전화번호를 추가해주세요");
		String phone = scan.nextLine();
		System.out.println("주소를 추가해주세요");
		String address = scan.nextLine();
		System.out.println("이메일를 추가해주세요");
		String email = scan.nextLine();
		System.out.println("나이를 추가해주세요");
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
	//삭제
	public void removeAddress() {
		System.out.println("몇번째를 지우시겠습니까?");
		int i = scan.nextInt();
		list.remove(i);
	}
	
	//수정
	public void modifyAddress() {
		
		System.out.println("몇번째 주소를 수정하시겠습니까?");
		int i = scan.nextInt();
		//Adress addr = list.get(i);

		System.out.println("무엇을 수 정하시겠습니까? 1. 이름   2. 전화번호   3. 주소   4. 이메일   5. 나이");
		
		
		String str = "";
		
		switch (scan.nextInt()) {
		case 1:
			scan.nextLine();
			System.out.println("이름을 수정해주세요");
			str = scan.nextLine();
			//addr.setName(str);	//addr 변수선언을 생략하고 list.get(i)로 대체 해서 .setName(str)을 넣는다.
			list.get(i).setName(str);
			
			break;
		case 2:
			scan.nextLine();
			System.out.println("전화번호를 수정해주세요");
			str = scan.nextLine();
			//addr.setPhoneNum(str);
			list.get(i).setName(str);
			
			break;
		case 3:
			scan.nextLine();
			System.out.println("주소을 수정해주세요");
			str = scan.nextLine();
			//addr.setAddress(str);
			list.get(i).setName(str);
		
			break;
		case 4:
			scan.nextLine();
			System.out.println("이메일을 수정해주세요");
			str = scan.nextLine();
			//addr.setEmail(str);
			list.get(i).setName(str);
			
			break;
		case 5:
			System.out.println("나이을 수정해주세요");
			int x = scan.nextInt();
			//addr.setAge(x);
			list.get(i).setName(str);
			
			break;
		};
	}
	
	public boolean mainProcess() {
		searchAll();
		System.out.println("1. 추가  2. 수정,  3. 삭제");
		
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

