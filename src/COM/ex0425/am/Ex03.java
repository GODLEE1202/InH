package COM.ex0425.am;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Adress> list = Arrays.asList(
				new Adress ("김삿갓", "01055435252", "서울시 광진구", "123@ㅁㄴㅇㅁㄴㅇ.com", 40),
				new Adress("이인행", "01053215242", "서울시 구로구", "ㅁㄴㅇㅋㅌ@ㅁㅇㅂㅈㄴㅇ.com", 27),
				new Adress("김일일", "01011111111", "서울시 금천구", "3213fd@asd.com", 28)
				);
	
		System.out.println("몇번째 주소를 수정하시겠습니까?");
		int i = scan.nextInt();
		//Adress addr = list.get(i);

		System.out.println("무엇을 수 정하시겠습니까? 1. 이름   2. 전화번호   3. 주소   4. 이메일   5. 나이");
		int j = scan.nextInt();
		
		scan.nextLine();
		
		String str = "";
		
		switch (j) {
		case 1:
			System.out.println("이름을 수정해주세요");
			str = scan.nextLine();
			//addr.setName(str);	//addr 변수선언을 생략하고 list.get(i)로 대체 해서 .setName(str)을 넣는다.
			list.get(i).setName(str);
			break;
		case 2:
			System.out.println("전화번호를 수정해주세요");
			str = scan.nextLine();
			//addr.setPhoneNum(str);
			list.get(i).setName(str);
			break;
		case 3:
			System.out.println("주소을 수정해주세요");
			str = scan.nextLine();
			//addr.setAddress(str);
			list.get(i).setName(str);
			break;
		case 4:
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
		
		//list.set(i, addr); 주소에 의한 참조로 인해 addr의 값을 수정하면 list의 값도 변하니까 list.set(i,addr)을 생략해도 상관없다. 
		for(Adress adress :list) {
			System.out.println(adress);
		}
	}
}
