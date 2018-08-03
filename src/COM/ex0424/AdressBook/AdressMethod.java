package COM.ex0424.AdressBook;

import java.util.*;
import java.util.stream.Stream;

public class AdressMethod {
	Scanner scan = new Scanner(System.in);
	List<AdressBook> list = new ArrayList<AdressBook>();
	//Map<PushData,List<AdressBook>> map = new HashMap<PushData, List<AdressBook>>(); 
	
	
	public  void showList() {	//전체 적힌 내용 출력 기능
		Stream<AdressBook> str = list.stream();
		if(list.size()==0)System.out.println("내용이 없음");
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
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("전화번호 를 입력해주세요");
		String num = scan.nextLine();
		System.out.println("주소를 입력해주세요");
		String ad = scan.nextLine();
		System.out.println("이메일을 입력해주세요");
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
		
		System.out.println("몇번째 주소를 수정하시겠습니까?");
		int i = scan.nextInt();

		System.out.println("무엇을 수 정하시겠습니까? 1. 이름   2. 전화번호   3. 주소   4. 이메일");
		int j = scan.nextInt();
	
		scan.nextLine();
		String str = "";
		
		switch (j) {
		case 1:
			System.out.println("이름을 수정해주세요");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 2:
			System.out.println("전화번호를 수정해주세요");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 3:
			System.out.println("주소을 수정해주세요");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		case 4:
			System.out.println("이메일을 수정해주세요");
			str = scan.nextLine();
			list.get(i).setName(str);
			break;
		};
	}
	public void removeList() {
		showList();
		System.out.println("몇번째 리스트를 삭제 하시겠습니까? (1부터)");
		int i = scan.nextInt()-1;
		list.remove(i);
	}
}
