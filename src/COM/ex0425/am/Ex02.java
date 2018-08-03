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
		list.add(ad1);	//(구)방식	변수 선언
		*/
		/*
		list.add(new Adress("김삿갓", "01055435252", "서울시 광진구", "123@ㅁㄴㅇㅁㄴㅇ.com", 40));
		list.add(new Adress("이인행", "01053215242", "서울시 구로구", "ㅁㄴㅇㅋㅌ@ㅁㅇㅂㅈㄴㅇ.com", 27));
		list.add(new Adress("김일일", "01011111111", "서울시 금천구", "3213fd@asd.com", 28));
	*/
		
		List<Adress> list = Arrays.asList(
				new Adress ("김삿갓", "01055435252", "서울시 광진구", "123@ㅁㄴㅇㅁㄴㅇ.com", 40),
				new Adress("이인행", "01053215242", "서울시 구로구", "ㅁㄴㅇㅋㅌ@ㅁㅇㅂㅈㄴㅇ.com", 27),
				new Adress("김일일", "01011111111", "서울시 금천구", "3213fd@asd.com", 28)
				);
		/*for (int i = 0; i < list.size(); i++) {
			Adress add = list.get(i);
			//System.out.println(add.toString());
			System.out.println(add); 위에줄에서 .toString생략 가능
			(구)방식  
			
			System.out.println(list.get(i)); 	//변수를 제거 함
		}*/
		for(Adress adress : list) {
			System.out.println(adress);
			//Adress를 list 끝까지 반복문
		}
	
	}
}
