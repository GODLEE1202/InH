package COM.ex0423.am;


import java.util.HashSet;

import java.util.Set;

public class Lotto_SetCollection {

	public static void main(String[] args) {
		//1~45까지의 숫자의 나열
		// 6개의 중복되지 않는 랜덤값
		
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			if(set.size()<6) {
				set.add((int)(Math.random()*8)+1);	
			}else break;
		}
		System.out.println(set);
	}
	
}
