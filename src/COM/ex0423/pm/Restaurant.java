package COM.ex0423.pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
	List<Table> list;
	Scanner scan = new Scanner(System.in);
	public Restaurant() {
		list = new ArrayList<Table>();
		doProcess();
		
	}
	public void doProcess() {
		while(true) {
			System.out.println("1.자리채우기 2. 자리비우기");
			int i = scan.nextInt();
			if(i==1) {
				list.add(new Table());
			}
			else if(i ==2)
			{
				System.out.println(list);
				System.out.println("몇번째 자리입니까?");
				int j = scan.nextInt();
				list.get(j).payMoney();
				list.remove(j);
			}
			else {
				System.out.println("몇번째 자리입니까?");
				list.remove(scan.nextInt());
			}
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}
