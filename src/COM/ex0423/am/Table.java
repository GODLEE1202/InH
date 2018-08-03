package COM.ex0423.am;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Table {
	
	public void tableNum() {
		
		Map<Integer, Integer> tableMap = new HashMap<Integer, Integer>();
		//테이블 숫자 , 계산할 가격
		tableMap.put(1,0);
		tableMap.put(2,0);
		tableMap.put(3,0);
		tableMap.put(4,0);
		tableMap.put(5,0);
		tableMap.put(6,0);
		tableMap.put(7,0);
		tableMap.put(8,0);
		tableMap.put(9,0);
		tableMap.put(10,0);
		
	}
	
	public int selectTable() {
		Scanner scan = new Scanner(System.in);
		//System.out.println("몇번테이블 입니까?");
		int i = scan.nextInt();
		
		return i;
	}

	public void tablePrice(int i) {
		i = selectTable();
		
		
	}
	
	
}
