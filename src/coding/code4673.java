package coding;

import java.util.ArrayList;

public class code4673 {

	public static void main(String[] args) {
		
		
		int min = 1;
		int max = 10000;
		
		ArrayList<Integer> unSelfNum = new ArrayList<Integer>();//NOT셀프넘버
		ArrayList<Integer> selfNum = new ArrayList<Integer>();//셀프넘버
		
		int nowNum;		//현재 계산중인 숫자
		int position;	//자리수
		int remainder;	//나머지
		int firstNum = 0;	//앞자리 숫자
		
		while(min<max) {//최대값 설정
			while(true) {
				if(!unSelfNum.contains(min)) {
					if(min<max) {
						selfNum.add(min);
					}
					
					nowNum = min++;
					
					break;
				}
				else min++;
			}
			while(nowNum < max) {
				position = (int)(Math.log10(nowNum));	//정수 로그10의 현재숫자 = 자리수
				remainder = nowNum;
				
				for (int i = position; i >= 0; i--) {
					firstNum = (int)(remainder/Math.pow(10, i));
					remainder -= (int)(firstNum * Math.pow(10, i));
					nowNum += firstNum;
				}
				if(firstNum >= max) break;
				if(!unSelfNum.contains(nowNum)) unSelfNum.add(nowNum);
			}
			
		}
		for (Integer integer : selfNum) {
			System.out.println(integer);
		}

}
}
