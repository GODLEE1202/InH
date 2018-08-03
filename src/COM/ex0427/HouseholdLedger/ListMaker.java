package COM.ex0427.HouseholdLedger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMaker {
	private Map<PushDate, List<Items>> map
	= new HashMap<PushDate, List<Items>>();
	
	public ListMaker() {
		/*PushDate pd1 = new PushDate();
		pd1.setMonth(4);
		pd1.setDay(25);*/
		//PushDate pd1 = new PushDate(4,25);
		List<Items> list1 = new ArrayList<Items>();
		/*Items item1_1 = new Items();
		item1_1.setObjName("���뱹");
		item1_1.setCount(1);
		item1_1.setPrice(5900);
		item1_1.setTotal(item1_1.getCount()*item1_1.getPrice());
		list1.add(item1_1);*/
		list1.add(new Items("���뱹",5900,1));
		list1.add(new Items("���̴�",1700,3));
		list1.add(new Items("����ũ",3000,1));
		list1.add(new Items("���̽�ũ��",1500,1));
		//map.put(pd1, list1);
		//map.put(new PushDate(4,25),list1 );
		map.put(new PushDate(4,25),list1);
		List<Items> list2 = new ArrayList<Items>();
		list2.add(new Items("�ұ���",11000,1));
		list2.add(new Items("��¥",6000,1));
		list2.add(new Items("�Ƹ޸�ī��",3000,1));
		map.put(new PushDate(4,26),list2);
		List<Items> list3 = new ArrayList<Items>();
		list3.add(new Items("�ֽ�",3000,1));
		list3.add(new Items("���̴�",1700,3));
		list3.add(new Items("ġŲ��",5900,1));
		map.put(new PushDate(4,27),list3);
	}

	public Map<PushDate, List<Items>> getMap() {
		return map;
	}
	
	
}




